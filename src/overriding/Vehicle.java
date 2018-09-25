package overriding;

public class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike2 obj = new Bike2();
		obj.run();
	}
}

class Bike2 extends Vehicle {
	void run() {
		System.out.println("Bike is running safely");
	}



}
