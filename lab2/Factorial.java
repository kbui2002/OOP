package lab2;

/**
 * 1.2 Debugging
 */
public class Factorial {
	public static void main(String[] args) {
		int n = 14;
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		System.out.println("The Factorial of " + n + " is " + factorial);
	}
}
