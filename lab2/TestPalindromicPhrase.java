package lab2;

import java.util.Scanner;

/**
 * 3.7 test palindromic word
 */
public class TestPalindromicPhrase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a phrase: ");
		String n = sc.nextLine();
		String in = "", out = "", n2 = n.toUpperCase();
		String[] alphabet = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		for (int i = 0; i < n.length(); i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (alphabet[j].equals(Character.toString(n2.charAt(i)))) {
					in += n2.charAt(i);
				}
			}
		}
		for (int h = in.length() - 1; h >= 0; h--) {
			out += in.charAt(h);
		}
		if (out.equals(in)) {
			System.out.println(n + " is a palindrome phrase");
		} else {
			System.out.println(n + " is not a palindrome phrase");
		}
		sc.close();
	}
}
