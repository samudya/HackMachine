package gates;

public class NOTGate extends UnaryGate {

    // Constructor
    public NOTGate(boolean a) {
        super(a);
    }


    @Override
    public boolean out() {
        return (!a);
    }
}
