package lab2;

import java.util.Scanner;

/**
 * 3.5 decipher caesar's code
 */
public class DecipherCaesarCode {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a ciphertext string: ");
		String n = sc.next().toUpperCase();
		String out = "";
		String[] alphabet = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
		for (int i = 0; i < n.length(); i++) {
			for (int j = 0; j < alphabet.length; j++) {
				if (alphabet[j].equals(Character.toString(n.charAt(i)))) {
					if (j < 3) {
						out += alphabet[j + 23];
					} else {
						out += alphabet[j - 3];
					}
				}
			}
		}
		System.out.println("The plaintext is: " + out);
		sc.close();
	}
}
