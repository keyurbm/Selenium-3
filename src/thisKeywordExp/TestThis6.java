package thisKeywordExp;

class A6 {
	A6() {
		this(5);
		System.out.println("hello a");
	}

	A6(int x) {
		System.out.println(x);
	}
}

class TestThis6 {
	public static void main(String args[]) {
		A6 a = new A6();
	}
}
