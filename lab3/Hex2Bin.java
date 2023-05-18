package lab3;

import java.util.Scanner;

/**
 * 1.4 hex to bin
 */
public class Hex2Bin {
    public static String convertStr(int a) {
        String s = "";
        int index = 0;
        int redundancy;
        while (index < 4) {
            redundancy = a % 2;
            s += String.valueOf(redundancy);
            a /= 2;
            index++;
        }
        return s;
    }

    public static String reverseStr(int a) {
        String s = convertStr(a);
        String[] str = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            str[i] = String.valueOf(s.charAt(i));
        }
        String string = "";
        for (int i = str.length - 1; i >= 0; i--) {
            string += str[i];
        }
        return string;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Hexadecimal string: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        System.out.printf("The equivalent binary for hexadecimal \"%s\" is: ", str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'f' || str.charAt(i) == 'b' || str.charAt(i) == 'c'
                    || str.charAt(i) == 'e' || str.charAt(i) == 'd') {
                switch (str.charAt(i)) {
                    case 'a':
                        System.out.print(reverseStr(10) + " ");
                        break;
                    case 'b':
                        System.out.print(reverseStr(11) + " ");
                        break;
                    case 'c':
                        System.out.print(reverseStr(12) + " ");
                        break;
                    case 'd':
                        System.out.print(reverseStr(13) + " ");
                        break;
                    case 'e':
                        System.out.print(reverseStr(14) + " ");
                        break;
                    case 'f':
                        System.out.print(reverseStr(15) + " ");
                        break;
                    default:
                        System.out.print("invalid");
                }
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                System.out.print(reverseStr(Integer.valueOf(String.valueOf(str.charAt(i)))) + " ");
            } else {
                System.out.print("invalid");
                break;
            }
        }
    }
}
