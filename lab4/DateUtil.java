package lab4;

/**
 * 1.9 date util
 */
public class DateUtil {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        int[] dayInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (year < 1 && year > 9999)
            return false;

        if (month < 1 && month > 12)
            return false;

        if (isLeapYear(year) && month == 2)
            dayInMonth[1] = 29;

        if (day > dayInMonth[month - 1])
            return false;
        return true;

    }

    public static int getDayOfWeek(int year, int month, int day) {
        int centuryNumber = 0;
        int numberOfMonthNormal[] = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
        int numberOfMonthInLeapYear[] = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
        int numberOfMonth = 0;
        if (1700 <= year && year < 1800 || 2100 <= year && year < 2200)
            centuryNumber = 4;
        if (1800 <= year && year < 1900 || 2200 <= year && year < 2300)
            centuryNumber = 2;
        if (1900 <= year && year < 2000 || 2300 <= year && year < 2400)
            centuryNumber = 0;
        if (2000 <= year && year < 2100 || 2400 <= year && year < 2500)
            centuryNumber = 6;
        int lastDigits = year % 100;

        if (isLeapYear(year))
            numberOfMonth = numberOfMonthInLeapYear[month - 1];
        else
            numberOfMonth = numberOfMonthNormal[month - 1];

        return (centuryNumber + lastDigits + (int) lastDigits / 4 + numberOfMonth + day) % 7;

    }

    public static String toString(int year, int month, int day) {
        String dayOnWeek = " ", monthInString = " ";
        switch (getDayOfWeek(year, month, day)) {
            case 0:
                dayOnWeek = "Sunday";
                break;
            case 1:
                dayOnWeek = "Monday";
                break;
            case 2:
                dayOnWeek = "Tuesday";
                break;
            case 3:
                dayOnWeek = "Webnesday";
                break;
            case 4:
                dayOnWeek = "Thusday";
                break;
            case 5:
                dayOnWeek = "Friday";
                break;
            case 6:
                dayOnWeek = "Saturday";
                break;
        }

        switch (month) {
            case 1:
                monthInString = "Jan";
                break;
            case 2:
                monthInString = "Feb";
                break;
            case 3:
                monthInString = "Mat";
                break;
            case 4:
                monthInString = "Apr";
                break;
            case 5:
                monthInString = "May";
                break;
            case 6:
                monthInString = "Jun";
                break;
            case 7:
                monthInString = "Jul";
                break;
            case 8:
                monthInString = "Aug";
                break;
            case 9:
                monthInString = "Set";
                break;
            case 10:
                monthInString = "Otc";
                break;
            case 11:
                monthInString = "Nov";
                break;
            case 12:
                monthInString = "Dec";
                break;
        }
        return dayOnWeek + " " + day + " " + monthInString + " " + year;

    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(1900)); // false
        System.out.println(isLeapYear(2000)); // true
        System.out.println(isLeapYear(2011)); // false
        System.out.println(isLeapYear(2012)); // true
        System.out.println(isValidDate(2012, 2, 29)); // true
        System.out.println(isValidDate(2011, 2, 29)); // false
        System.out.println(isValidDate(2099, 12, 31)); // true
        System.out.println(isValidDate(2099, 12, 32)); // false

        System.out.println(getDayOfWeek(1982, 4, 24)); // 6 : Sat
        System.out.println(getDayOfWeek(2000, 1, 1)); // 6 : Sat
        System.out.println(getDayOfWeek(2054, 6, 19)); // 5 : Fri
        System.out.println(getDayOfWeek(2012, 2, 17)); // 5 : Fri
        System.out.println(toString(2012, 2, 14)); // Tuesday 14 Feb 2012
    }
}