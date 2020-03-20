package alu;

import memory.DRegister;
import memory.Register;

public class HackALU implements ALU {

    // Input control flag, only one flag implemented for simplicity.
    private boolean flagF; // function flag

    // Output flags
    private boolean flagZr; // output zero flag
    private boolean flagNg; // output negative flag

    public Register compute(Register r1, Register r2) {
        Register result;

        if (flagF) {
            System.out.println("ALU performing ADD operation");
            result = add(r1, r2);
        } else {
            System.out.println("ALU performing SUBTRACT operation");
            result = sub(r1, r2);
        }
        if (result.getValue() == 0) {
            flagZr = true;
        } else if (result.getValue() < 0) {
            flagNg = true;
        }
        return result;

    }

    public Register add(Register r1, Register r2) {
        short r1Value = r1.getValue();
        short r2Value = r2.getValue();
        short sum = (short) (r1Value + r2Value);
        DRegister result = new DRegister(sum);
        return result;
    }

    public Register sub(Register r1, Register r2) {
        short r1Value = r1.getValue();
        short r2Value = r2.getValue();
        short sum = (short) (r1Value - r2Value);
        DRegister result = new DRegister(sum);
        return result;
    }


    public boolean isFlagF() {
        return flagF;
    }

    @Override
    public void setFlagF(boolean flagF) {
        this.flagF = flagF;
    }

    @Override
    public boolean isFlagZr() {
        return flagZr;
    }

    @Override
    public boolean isFlagNg() {
        return flagNg;
    }
}
