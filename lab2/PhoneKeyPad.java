package lab2;

import java.util.Scanner;

/**
 * 3.3 phone key pad
 */
public class PhoneKeyPad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String n = sc.next().toLowerCase();
		sc.close();
		keyPad(n);
	}

	public static void keyPad(String n) {
		for (int i = 0; i < n.length(); i++) {
			char inChar = n.charAt(i);
			switch (inChar) {
				case 'a':
				case 'b':
				case 'c':
					System.out.print(2);
					break;
				case 'd':
				case 'e':
				case 'f':
					System.out.print(3);
					break;
				case 'g':
				case 'h':
				case 'i':
					System.out.print(4);
					break;
				case 'j':
				case 'k':
				case 'l':
					System.out.print(5);
					break;
				case 'm':
				case 'n':
				case 'o':
					System.out.print(6);
					break;
				case 'p':
				case 'q':
				case 'r':
				case 's':
					System.out.print(7);
					break;
				case 't':
				case 'u':
				case 'v':
					System.out.print(8);
					break;
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					System.out.print(9);
					break;
			}
		}
	}
}
