package lab2;

import java.util.Scanner;

/**
 * 3.9 bin 2 dec
 */
public class Bin2Dec {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Binary string: ");
		int number = input.nextInt();
		int binary = number;
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0) {
				break;
			} else {
				int temp = binary % 10;
				if (temp > 1) {
					System.out.println("error: invalid binary string (" + number + ")");
					break;
				}
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		if (decimal > 0) {
			System.out.println("The equivalent decimal number for (" + number + ") is: " + decimal);
		}
		input.close();
	}
}
