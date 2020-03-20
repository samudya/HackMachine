package cpu;

import alu.ALU;
import memory.ARegister;
import memory.DRegister;

import java.util.concurrent.atomic.AtomicInteger;

public interface CPU {
    ALU getAlu();

    AtomicInteger getProgramCounter();

    ARegister getaRegister();

    DRegister getdRegister();

    void setaRegister(ARegister aReg);

    void setdRegister(DRegister dReg);
}
