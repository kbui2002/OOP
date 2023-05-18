package lab1;

/**
 * 1.1 check pass fail
 */
public class CheckPassFail {
    public static void main(String[] args) {
        int[] mark = { 0, 49, 50, 51, 100 };
        for (int i = 0; i < mark.length; i++) {
            System.out.println("The mark is " + mark[i]);

            if (mark[i] >= 50) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
            System.out.println("DONE");
        }
    }
}