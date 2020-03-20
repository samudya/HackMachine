import java.util.Hashtable;

public class Alg1 {

	
public static void main(String[] args) {
	Hashtable<Integer, String> coursetable = new Hashtable();
	coursetable.put(1001, "nand2tetris");
	coursetable.put(1002, "Algorithms");
	coursetable.put(1003, "LinearAlgebra");
	
	System.out.println("Couse id 1002 is " + coursetable.get(1001) );
	
	coursetable.forEach((k,v)->System.out.println(k + "=" + v)); 
	
	
	
	
}
}