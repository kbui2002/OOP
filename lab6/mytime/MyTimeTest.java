package lab6.mytime;

import java.util.*;

public class MyTimeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour = sc.nextInt();
        System.out.print("Enter minute: ");
        int minute = sc.nextInt();
        System.out.print("Enter second: ");
        int second = sc.nextInt();
        MyTime time = new MyTime(hour, minute, second);
        System.out.println("TIME: " + time.toString());
        System.out.println("Next hour: " + time.nextHour());
        System.out.println("Next minute: " + time.nextMinute());
        System.out.println("Next second: " + time.nextSecond());
        System.out.println("Pre hour: " + time.previousHour());
        System.out.println("Pre minute: " + time.previousMinute());
        System.out.println("Pre second: " + time.previousSecond());
    }
}
