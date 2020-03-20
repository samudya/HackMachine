package gates;

/**
 * And gate:
 * compute = 1 if (a == 1 and b == 1)
 *       0 otherwise
 *
 *  true represents 1 and false 0
 */
public class ANDGate extends BinaryGate {

    public ANDGate(boolean a, boolean b) {
        super(a, b);
    }

    
    public boolean out() {
        return a && b;
    }
}
