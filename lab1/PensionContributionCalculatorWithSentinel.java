package lab1;

import java.util.Scanner;

/**
 * 3.4 Pension contribution calculator with sentinal
 */
public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        // Declare constants
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;
        final double SENTINEL = -1;
        // Declare variables
        int salary; 
        int age; 
        // to be input
        double employeeContribution;
        double employerContribution;
        double totalContribution;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end): $");
        salary = sc.nextInt();

        while (salary != SENTINEL) {
            System.out.print("Enter the age: ");
            age = sc.nextInt();

            // Check the contribution cap
            int contributableSalary = SALARY_CEILING;
            // Compute various contributions in "double" using a nested-if to handle 4 cases
            if (age <= 55) { // 55 and below
                employeeContribution = (double) salary * EMPLOYEE_RATE_55_AND_BELOW;
                employerContribution = (double) salary * EMPLOYER_RATE_55_AND_BELOW;
                totalContribution = (double) employeeContribution + employerContribution;

                System.out.printf("The employee's contribution is: %.2f%n", employeeContribution);
                System.out.printf("The employer's contribution is: %.2f%n", employerContribution);
                System.out.printf("The total contribution is: %.2f%n", totalContribution);
            } else if (age <= 60) { // (55, 60]
                employeeContribution = (double) salary * EMPLOYEE_RATE_55_TO_60;
                employerContribution = (double) salary * EMPLOYER_RATE_55_TO_60;
                totalContribution = (double) employeeContribution + employerContribution;

                System.out.printf("The employee's contribution is: %.2f%n", employeeContribution);
                System.out.printf("The employer's contribution is: %.2f%n", employerContribution);
                System.out.printf("The total contribution is: %.2f%n", totalContribution);
            } else if (age <= 65) { // (60, 65]
                employeeContribution = (double) salary * EMPLOYEE_RATE_60_TO_65;
                employerContribution = (double) salary * EMPLOYER_RATE_60_TO_65;
                totalContribution = (double) employeeContribution + employerContribution;

                System.out.printf("The employee's contribution is: %.2f%n", employeeContribution);
                System.out.printf("The employer's contribution is: %.2f%n", employerContribution);
                System.out.printf("The total contribution is: %.2f%n", totalContribution);
            } else { // above 65
                employeeContribution = (double) salary * EMPLOYEE_RATE_65_ABOVE;
                employerContribution = (double) salary * EMPLOYER_RATE_65_ABOVE;
                totalContribution = (double) employeeContribution + employerContribution;

                System.out.printf("The employee's contribution is: %.2f%n", employeeContribution);
                System.out.printf("The employer's contribution is: %.2f%n", employerContribution);
                System.out.printf("The total contribution is: %.2f%n", totalContribution);
            }
            // Read the next input and repeat
            System.out.print("Enter the monthly salary (or -1 to end): $");
            salary = sc.nextInt();
        }
    }
}