package machine;

import alu.ALU;
import cpu.CPU;
import io.IOInterface;
import memory.*;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class TestHackMachine {

	public static void main(String[] args) {

		HackMachine hackMachine = new HackMachine();
		CPU cpu = hackMachine.getCpu();
		ALU alu = cpu.getAlu();
		Memory mem = hackMachine.getMemory();
		IOInterface io = hackMachine.getIo();

		/* *************** Testing ALU *******************/
		System.out.println("\n***************Testing HackALU ***************");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input x for ALU operation :");
		short x = sc.nextShort();
		System.out.println("Enter input y for ALU operation :");
		short y = sc.nextShort();
		DRegister r1 = new DRegister(x);
		DRegister r2 = new DRegister(y);
		System.out.println("Enter control flag for function 1 for additon, 0 for subtraction :");
		short f = sc.nextShort();
		if (f == 1)
			alu.setFlagF(true);
		else
			alu.setFlagF(false);
		System.out.println("ALU output " + alu.compute(r1, r2).getValue());
		System.out.println("ALU output flag Zr; whether output is zero: " +alu.isFlagZr());
		System.out.println("ALU output flag Ng; whether output is negative: " +alu.isFlagNg());

		
		/* *************** Testing Memory *******************/
		System.out.println("\n***************Testing Hack memory ***************");
		System.out.println("Memory size is " + mem.getSize());
		System.out.println("Enter memory location to store:");
		short loc = sc.nextShort();
		System.out.println("Enter data to store:");
		short value = sc.nextShort();
		ARegister address = new ARegister(loc);
		DRegister data = new DRegister(value);

		try {
			mem.store(address, data);
		} catch (MemoryException e) {
			System.out.println("Exception in store method - " + e.getMessage());
		}
		System.out.println("Store Success in the memory location");

		System.out.println("Enter memory location to fetch:");
		loc = sc.nextShort();
		address = new ARegister(loc);
		try {
			Register dataFetched = mem.fetch(address);
			System.out.println("Fetch Success from memory location - value =" + dataFetched.getValue());
		} catch (MemoryException e) {
			System.out.println("Exception in store method - " + e.getMessage());
		}

		/* *************** Testing IO *******************/
		System.out.println("\n*************** Testing Hack IO Unit *************** ");

		System.out.println("Enter number on InputStream ");
		Register input = io.readData();
		System.out.println("Read from input = " + input.getValue());
		System.out.println("Writing to output is ");
		io.writeData(input);
		
		
		/* ******Testing CPU******* */
		System.out.println("\n***************Testing CPU***************");
		AtomicInteger programCounter = cpu.getProgramCounter();
		int nextInstruction = programCounter.getAndIncrement();
		// ROM[0] has A instruction like @0
		ARegister aReg = new ARegister((short) 0);
		System.out.println("Setting instruction @0 into ARegister ");
		cpu.setaRegister(aReg);
		// D=M means D = RAM[0]; lets say RAM[0] has value 0;
		DRegister dReg = new DRegister((short) 0);
		System.out.println("Setting instruction D=M into DRegister ");
		cpu.setdRegister(dReg);
		System.out.println("Executing instruction @ ROM[" + nextInstruction + "]");
		nextInstruction = cpu.getProgramCounter().getAndIncrement();
		System.out.println("Executing instruction @ ROM[" + nextInstruction + "]");

	}
}
