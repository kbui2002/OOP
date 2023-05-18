package lab1;

/**
 * 1.3 print number in word
 */
public class PrintNumberInWord {
    public static void main(String[] args) {
        int[] number = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < number.length; i++) {
            // using nested if
            if (number[i] == 1) {
                System.out.println("ONE");
            } else if (number[i] == 2) {
                System.out.println("TWO");
            } else if (number[i] == 3) {
                System.out.println("THREE");
            } else if (number[i] == 4) {
                System.out.println("FOUR");
            } else if (number[i] == 5) {
                System.out.println("FIVE");
            } else if (number[i] == 6) {
                System.out.println("SIX");
            } else if (number[i] == 7) {
                System.out.println("SEVEN");
            } else if (number[i] == 8) {
                System.out.println("EIGHT");
            } else if (number[i] == 9) {
                System.out.println("NINE");
            } else {
                System.out.println("OTHER");
            }
            /// using switch case default
            switch (number[i]) {
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("OTHER");
            }
        }
    }
}