	package gates;
	
	public abstract class BinaryGate implements GateInterface {
	    protected boolean a, b;
	    protected BinaryGate (boolean a, boolean b) {
	        this.a = a;
	        this.b = b;
	    }
	}
