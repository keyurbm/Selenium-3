package loop;

/* The Java do-while loop is used to iterate a part of the program several times. If the number of 
 * iteration is not fixed and you must have to execute the loop at least once, it is recommended to use 
 * do-while loop.The Java do-while loop is executed at least once because condition is checked after loop 
 * body.*/

public class DoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
	}
}
