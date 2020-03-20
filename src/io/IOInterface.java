package io;

import memory.Register;

public interface IOInterface {
    Register readData();

    void writeData(Register data);
}
