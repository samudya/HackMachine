package machine;

import cpu.CPU;
import cpu.HackCPU;
import io.HackIO;
import io.IOInterface;
import memory.Memory;

public class HackMachine {

    private Memory memory;
    private CPU cpu;
    private IOInterface io;

    public HackMachine() {
        this.memory = new Memory((short)4000);
        this.cpu = new HackCPU();
        this.io = new HackIO(System.in, System.out);
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public IOInterface getIo() {
        return io;
    }

    public void setIo(IOInterface io) {
        this.io = io;
    }
}
