package cpu;

import alu.HackALU;
import alu.ALU;
import memory.ARegister;
import memory.DRegister;

import java.util.concurrent.atomic.AtomicInteger;

public class HackCPU implements CPU {
    private ALU alu;
    private AtomicInteger programCounter;
    private ARegister aRegister;
    private DRegister dRegister;

    public HackCPU() {
        this.alu = new HackALU();
        this.programCounter = new AtomicInteger(0);
        this.aRegister = new ARegister((short) 0);
        this.dRegister = new DRegister((short) 0);
    }

    @Override
    public ALU getAlu() {
        return alu;
    }

    public void setAlu(ALU alu) {
        this.alu = alu;
    }

    @Override
    public AtomicInteger getProgramCounter() {
        return programCounter;
    }

    public void setProgramCounter(AtomicInteger programCounter) {
        this.programCounter = programCounter;
    }

    @Override
    public ARegister getaRegister() {
        return aRegister;
    }

    public void setaRegister(ARegister aRegister) {
        this.aRegister = aRegister;
    }

    @Override
    public DRegister getdRegister() {
        return dRegister;
    }

    public void setdRegister(DRegister dRegister) {
        this.dRegister = dRegister;
    }
}
