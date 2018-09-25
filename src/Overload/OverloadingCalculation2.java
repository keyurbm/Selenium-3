package Overload;

//Example of Method Overloading with Type Promotion if matching found

public class OverloadingCalculation2 {
	void sum(int a,int b){System.out.println("int arg method invoked");}  
	void sum(long a,long b){System.out.println("long arg method invoked");}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingCalculation2 obj=new OverloadingCalculation2();  
		obj.sum(2000000000,2000000000);//now int arg sum() method gets invoked  
	}
}
