package lab2;

import java.util.Scanner;

/**
 * 3.2 count vowels digits
 */
public class CountVowelsDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String n = sc.next().toLowerCase();
		sc.close();
		double numVow = 0, numDig = 0, length = n.length();
		for (int i = 0; i < n.length(); i++) {
			if (n.charAt(i) == 'a' | n.charAt(i) == 'e' | n.charAt(i) == 'i' | n.charAt(i) == 'o'
					| n.charAt(i) == 'u') {
				numVow++;
			}
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9') {
				numDig++;
			}
		}
		double perVow = numVow * 100 / length;
		double perDig = numDig * 100 / length;
		System.out.print("Number of vowels: " + numVow);
		System.out.printf(" (%.2f%%)", perVow);
		System.out.println();
		System.out.print("Number of digits: " + numDig);
		System.out.printf(" (%.2f%%)", perDig);
	}
}
