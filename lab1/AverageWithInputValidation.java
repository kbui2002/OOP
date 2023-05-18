package lab1;

import java.util.Scanner;

/**
 * 3.7 Average with input validation
 */
public class AverageWithInputValidation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isValid = false;
		int numberIn;
		double sum = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.print("Enter the mark (0-100) for student " + i + ": ");
			do {
				numberIn = input.nextInt();
				if (numberIn >= 0 && numberIn <= 100) {
					sum += numberIn;
					isValid = true;
				} else {
					System.out.println("Invalid input, try again...");
					System.out.print("Enter the mark (0-100) for student " + i + ": ");
					isValid = false;
				}
			} while (!isValid);
		}
		input.close();
		double aver = sum / 3;
		if (isValid == true) {
			System.out.printf("You have entered: %.2f", aver);
		}
	}
}
