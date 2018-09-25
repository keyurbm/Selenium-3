public class CallByValue {
	int a = 50;
	void change(int data) {
		// changes will be in the local variable only
		a = a + 100; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue cv = new CallByValue();
		System.out.println("before change " + cv.a);
		cv.change(500);
		System.out.println("after change " + cv.a);
	}
}
