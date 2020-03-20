package alu;

import memory.Register;

public interface ALU {

    Register compute(Register r1, Register r2);

    void setFlagF(boolean flagF);

    boolean isFlagZr();

    boolean isFlagNg();
}
