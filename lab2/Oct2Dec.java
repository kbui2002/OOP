package lab2;

import java.util.Scanner;

/**
 * 3.11 oct 2 dec
 */
public class Oct2Dec {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Octal number: ");
		int in = input.nextInt();
		int oct = in;
		int decimal = 0;
		int n = 0; // number of digits
		while (oct != 0) {
			int temp = oct % 10;
			decimal += temp * Math.pow(8, n);
			oct = oct / 10;
			n++;
		}
		System.out.print("The equivalent decimal number (" + in + ") is: " + decimal);
		input.close();
	}
}
