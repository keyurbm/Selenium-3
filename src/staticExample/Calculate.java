package staticExample;

public class Calculate {
	static int cube(int x) {
		return x * x * x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = Calculate.cube(5);
		System.out.println(result);
	}
}
