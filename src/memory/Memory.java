package memory;

public class Memory implements MemoryInterface {
    private Register[] registerCells;
    private short size;

    // Default Constructor
    public Memory() {
        this(DEFAULT_SIZE);
    }

    // Overloading concept for constructor.
    public Memory(short size) {
        this.size = size;
        this.registerCells = new Register[size];
        for (int i = 0; i < size; i++) {
            registerCells[i] = new DRegister((short) 0);
        }
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public Register fetch(ARegister aRegister) throws MemoryException {
        short address = aRegister.getValue();
        if (address > registerCells.length) {
            throw new MemoryException("Address index of bounds" + address);
        }
        return registerCells[address];
    }

    @Override
    public void store(ARegister aRegister, DRegister dRegister) throws MemoryException {
        short address = aRegister.getValue();
        try {
            registerCells[address] = dRegister;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new MemoryException("Address index of bounds");
        }
    }

}
