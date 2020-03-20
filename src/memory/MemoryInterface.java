package memory;

public interface MemoryInterface {

    short DEFAULT_SIZE = 100;

    int getSize();

    Register fetch(ARegister address) throws MemoryException;

    void store(ARegister address, DRegister data) throws MemoryException;
}
