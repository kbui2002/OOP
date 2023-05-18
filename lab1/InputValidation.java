package lab1;

import java.util.Scanner;

/**
 * 3.6 Input validation
 */
public class InputValidation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isValid = false;
		int numberIn;
		do {
			System.out.print("Enter a number between 0-10 or 90-100: ");
			numberIn = input.nextInt();
			if ((numberIn >= 0 && numberIn <= 10) || (numberIn >= 90 && numberIn <= 100)) {
				isValid = true;
			} else {
				System.out.println("Invalid input, try again...");
			}
		} while (!isValid);
		input.close();
		if (isValid == true) {
			System.out.println("You have entered: " + numberIn);
		}
	}
}
