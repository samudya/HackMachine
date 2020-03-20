package io;

import memory.DRegister;
import memory.Register;

import java.io.*;
import java.util.Scanner;

public class HackIO implements IOInterface {
    private InputStream inputStream;
    private PrintStream outputStream;

    public HackIO(InputStream in, PrintStream out) {
        inputStream = in;
        outputStream = out;
    }

    
    public Register readData() {
        Scanner scanner = new Scanner(inputStream);
        short input = scanner.nextShort(); // reads from input
        return new DRegister(input);
    }


    
    public void writeData(Register data) {
        outputStream.println(data.getValue());
    }

}
