package gates;

/**
 * Or gate: compute = Not(a) Nand Not(b)
 * compute = 1 if (a == 1 or b == 1)
 *        0 otherwise
 */

public class ORGate extends BinaryGate {

   // Constructor
    public ORGate(boolean a, boolean b) {
        super(a, b);
    }

    // Implementation of Gate interface
   // Overridden method
    public boolean out() {
        return a || b;
    }
}
