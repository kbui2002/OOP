package lab2;

import java.util.Scanner;

/**
 * 1.5 box pattern
 */
public class BoxPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int n = sc.nextInt();
		sc.close();
		patternA(n);
		patternB(n);
		patternC(n);
		patternD(n);
	}

	// a
	public static void patternA(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == 1 | row == n | col == 1 | col == n) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("(a)");
		System.out.println();
	}

	// b
	public static void patternB(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == 1 | col == row | row == n) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("(b)");
		System.out.println();
	}

	// c
	public static void patternC(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == 1 | col == n - row + 1 | row == n) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("(c)");
		System.out.println();
	}

	// d
	public static void patternD(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n; col++) {
				if (row == 1 | col == row | col == n - row + 1 | row == n) {
					System.out.print("# ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("(a)");
	}
}
