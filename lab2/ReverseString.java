package lab2;

import java.util.Scanner;

/**
 * 3.1 reverse string
 */
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String inString = sc.next();
		int inStrLength = inString.length();
		System.out.print("The reverse of the String (" + inString + ") is ");
		for (int charIdx = inStrLength - 1; charIdx >= 0; charIdx--) {
			System.out.print(inString.charAt(charIdx));
		}
		sc.close();
	}
}
