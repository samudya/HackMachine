package memory;

public class Register {
    private short value;

    protected Register(short value) {
        this.value = value;
    }

    public short getValue() {
        return value;
    }
}
