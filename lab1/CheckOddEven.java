package lab1;

/**
 * 1.2 Check odd even
 */
public class CheckOddEven {
    public static void main(String[] args) {
        int[] number = { 0, 1, 88, 99, -1, -2 };
        for (int i = 0; i < number.length; i++) {
            System.out.println("The number is " + number[i]);
            if (number[i] % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            System.out.println("bye !");
        }
    }
}