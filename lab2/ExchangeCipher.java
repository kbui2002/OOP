package lab2;

import java.util.Scanner;

/**
 * 3.6 exchange cipher
 */
public class ExchangeCipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a plaintext string: ");
		String n = sc.next().toUpperCase();
		System.out.print("The ciphertext string is: ");
		for (int i = n.length() - 1; i >= 0; i--) {
			System.out.print(n.charAt(i));
		}
		sc.close();
	}
}
