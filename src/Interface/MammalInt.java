package Interface;

public class MammalInt implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal eats");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal travels");
	}
	
	public int noOfLegs(){
		return 1; 
	}
	
	public static void main(String[] args) {
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
	}
}
