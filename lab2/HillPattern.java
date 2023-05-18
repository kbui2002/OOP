package lab2;

import java.util.Scanner;

/**
 * 1.6 hill pattern
 */
public class HillPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		sc.close();
		patternA(n);
		patternB(n);
		patternC(n);
		patternDAbove(n);
		patternDBellow(n);
	}

	// a
	public static void patternA(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col1 = 1; col1 <= n - row; col1++) {
				System.out.print("  ");
			}
			for (int col2 = 1; col2 <= 2 * row - 1; col2++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("(a)");
		System.out.println();
	}

	// b
	public static void patternB(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col1 = 1; col1 < row; col1++) {
				System.out.print("  ");
			}
			for (int col2 = 1; col2 <= 2 * (n - row + 1) - 1; col2++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("(b)");
		System.out.println();
	}

	// c
	public static void patternC(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col1 = 1; col1 <= n - row; col1++) {
				System.out.print("  ");
			}
			for (int col2 = 1; col2 <= 2 * row - 1; col2++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		for (int row = 2; row <= n; row++) {
			for (int col1 = 1; col1 < row; col1++) {
				System.out.print("  ");
			}
			for (int col2 = 1; col2 <= 2 * (n - row + 1) - 1; col2++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println("(c)");
		System.out.println();
	}

	// d
	// print half above
	public static void patternDAbove(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			System.out.print("# ");
		}
		System.out.println();
		for (int row = 2; row <= n; row++) {
			int space = 2 * row - 3;
			int number = 2 * n - 1 - space;
			for (int col1 = 1; col1 <= number / 2; col1++) {
				System.out.print("# ");
			}
			for (int col2 = 1; col2 <= space; col2++) {
				System.out.print("  ");
			}
			for (int col1 = 1; col1 <= number / 2; col1++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	// print half below
	public static void patternDBellow(int n) {
		for (int row = 2; row < n; row++) {
			int space = 2 * (n - row + 1) - 3;
			int number = 2 * n - 1 - space;
			for (int col1 = 1; col1 <= number / 2; col1++) {
				System.out.print("# ");
			}
			for (int col2 = 1; col2 <= space; col2++) {
				System.out.print("  ");
			}
			for (int col1 = 1; col1 <= number / 2; col1++) {
				System.out.print("# ");
			}
			System.out.println();
		}
		for (int j = 1; j <= 2 * n - 1; j++) {
			System.out.print("# ");
		}
		System.out.println("(d)");
	}
}
