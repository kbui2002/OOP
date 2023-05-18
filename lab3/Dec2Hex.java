package lab3;

import java.util.Scanner;

/**
 * 1.5 hex to dec
 */
public class Dec2Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num_item = sc.nextInt();
        System.out.print("The equivalent hexadecimal number is: " + convertToHex(num_item));
        System.out.println();
    }

    public static String convertToHex(int a) {
        String str[] = convertString(a).split("\\s+");
        for (int i = 0; i < str.length; i++) {
            if (Integer.valueOf(str[i]) >= 0 && Integer.valueOf(str[i]) <= 9) {
                str[i] = str[i];
            } else if (Integer.valueOf(str[i]) >= 10 && Integer.valueOf(str[i]) <= 15) {
                switch (Integer.valueOf(str[i])) {
                    case 10:
                        str[i] = "A";
                        break;
                    case 11:
                        str[i] = "B";
                        break;
                    case 12:
                        str[i] = "C";
                        break;
                    case 13:
                        str[i] = "D";
                        break;
                    case 14:
                        str[i] = "E";
                        break;
                    case 15:
                        str[i] = "F";
                        break;
                    default:
                }
            } else {
                return "invalid";
            }
        }
        String new_str = "";
        for (int i = str.length - 1; i >= 0; i--) {
            new_str += str[i];
        }
        return new_str;
    }

    public static String convertString(int a) {
        String s = "";
        int k;
        while (a > 0) {
            k = a % 16;
            a /= 16;
            s += String.valueOf(k) + " ";
        }
        return s;
    }
}
