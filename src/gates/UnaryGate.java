package gates;

public abstract class UnaryGate implements GateInterface {
    protected boolean a;

    protected UnaryGate(boolean a) {
        this.a = a;
    }

}
