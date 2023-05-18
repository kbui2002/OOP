package lab2;

import java.util.Scanner;

/**
 * 3.12 radixN 2 dec
 */
public class RadixN2Dec {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radix: ");
		int radix = input.nextInt();
		System.out.print("Enter the string: ");
		String in = input.next();
		String hex = in.toUpperCase();
		String digits = "0123456789ABCDEF";
		int val = 0;
		if (hex.length() > radix) {
			System.out.println("error: invalid decimal string (" + in + ")");
		} else {
			for (int i = 0; i < hex.length(); i++) {
				char c = hex.charAt(i);
				int d = digits.indexOf(c);
				if (d == -1) {
					System.out.println("error: invalid decimal string " + in + ")");
					val = 0;
					break;
				} else {
					val = 16 * val + d;
				}
			}
		}
		if (val > 0) {
			System.out.println("The equivalent decimal number (" + in + ") is: " + val);
		}
		input.close();
	}
}
