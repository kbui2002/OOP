package lab1;

/**
 * 1.4 print day in word
 */
public class PrintDayInWord {
    public static void main(String[] args) {
        int[] day = { 0, 1, 2, 3, 4, 5, 6, 7 };
        for (int i = 0; i < day.length; i++) {
            if (day[i] == 0) {
                System.out.println("Sunday");
            } else if (day[i] == 1) {
                System.out.println("Monday");
            } else if (day[i] == 2) {
                System.out.println("Tuesday");
            } else if (day[i] == 3) {
                System.out.println("Wednesday");
            } else if (day[i] == 4) {
                System.out.println("Thursday");
            } else if (day[i] == 5) {
                System.out.println("Friday");
            } else if (day[i] == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Not a valid day");
            }

            switch (day[i]) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Not a valid day");
            }
        }
    }
}