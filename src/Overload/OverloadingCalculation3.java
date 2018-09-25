package Overload;

// Example of Method Overloading with Type Promotion in case of ambiguity/* If there are no matching type arguments in the method, and each method promotes similar number of 
arguments, there will be ambiguity. */

public class OverloadingCalculation3 {
	void sum(int a, long b) {
		System.out.println("a method invoked");
	}

	void sum(long a, int b) {
		System.out.println("b method invoked");
	}

	public static void main(String args[]) {
		OverloadingCalculation3 obj = new OverloadingCalculation3();
		obj.sum(20, 20);// now ambiguity
	}
}