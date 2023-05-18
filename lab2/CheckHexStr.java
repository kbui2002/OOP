package lab2;

import java.util.Scanner;

/**
 * 3.8 check heck string
 */
public class CheckHexStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a hex string: ");
		String in = sc.next();
		String n = in.toUpperCase();
		int count = 0;
		String[] alphabet = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };
		for (int i = 0; i < n.length(); i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (alphabet[j].equals(Character.toString(n.charAt(i)))) {
					count++;
					break;
				} else {
					continue;
				}
			}
		}
		if (count == in.length()) {
			System.out.println(in + " is a hex string");
		} else {
			System.out.println(in + " is not a hex string");
		}
		sc.close();
	}
}
