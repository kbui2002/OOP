package lab2;

import java.util.Scanner;

/**
 * 3.7 test palindromic word
 */
public class TestPalindromicWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String n = sc.next();
		String out = "";
		sc.close();
		for (int i = n.length() - 1; i >= 0; i--) {
			out += n.charAt(i);
		}
		if (out.equals(n)) {
			System.out.println(n + " is a palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}
	}
}