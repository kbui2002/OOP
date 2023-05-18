package lab4;

import java.util.Scanner;
import java.lang.Math;

/**
 * 1.6 number system conversion
 */
public class NumberSystemConversion {
    // Handle input and print the result
    public static void toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == 2 && outRadix == 10)
            bin2Dec(in);
        else if (inRadix == 16 && outRadix == 10)
            hex2Dec(in);
        else if (inRadix == 8 && outRadix == 10)
            oct2Dec(in);
        else if (inRadix == 16 && outRadix == 2)
            hex2Bin(in);
        else if (inRadix == 10 && outRadix == 16)
            dec2Hex(in);
        else
            System.out.println("Invalid convert!");
    }

    // Radix -> Dec
    /*
     * Bin2Dec function Convert from Binary to Decimal
     */
    public static void bin2Dec(String bin) {
        // Declare variables
        int numBin; // index of character in bin from biggest
        int dec = 0;// result by convert Binary to Decimal

        numBin = bin.length() - 1;
        // use for-loop
        for (int charIdx = 0; charIdx < bin.length(); charIdx++) {
            // charIdx = 0,1,.. bin.length()
            if (bin.charAt(charIdx) != '1' && bin.charAt(charIdx) != '0') { // Check invalid if differ 1 and 0
                System.out.println("error: invalid binary string " + bin);
                System.exit(1);
            }
            dec += Character.getNumericValue(bin.charAt(charIdx)) * Math.pow(2, numBin); // Convert to Decimal
            numBin--; // Index decrease by 1
        }
        System.out.println("The e quivalent decimal number for binary " + bin + " is: " + dec); // Print the result
    }

    /*
     * Convert from Heximal to Decimal
     */
    public static void hex2Dec(String hex) {
        // Declare variables
        int numHex; // index of character in bin from biggest
        int dec = 0;// result by convert Binary to Decimal

        numHex = hex.length() - 1;

        // use for-loop
        for (int charIdx = 0; charIdx < hex.length(); charIdx++) {
            if (!((hex.charAt(charIdx) >= '0' && hex.charAt(charIdx) <= '9')
                    || (hex.charAt(charIdx) >= 'a' && (hex.charAt(charIdx) <= 'f')
                            || (hex.charAt(charIdx) >= 'A' && hex.charAt(charIdx) <= 'F')))) {
                System.out.println("error: invalid hexadecimal string " + hex);
                System.exit(1);
            }

            int tmp;
            if (hex.charAt(charIdx) == 'a' || hex.charAt(charIdx) == 'A') {
                tmp = 10;
                dec += tmp * Math.pow(16, numHex);
            } else if (hex.charAt(charIdx) == 'b' || hex.charAt(charIdx) == 'B') {
                tmp = 11;
                dec += tmp * Math.pow(16, numHex);
            } else if (hex.charAt(charIdx) == 'c' || hex.charAt(charIdx) == 'C') {
                tmp = 12;
                dec += tmp * Math.pow(16, numHex);
            } else if (hex.charAt(charIdx) == 'd' || hex.charAt(charIdx) == 'D') {
                tmp = 13;
                dec += tmp * Math.pow(16, numHex);
            } else if (hex.charAt(charIdx) == 'e' || hex.charAt(charIdx) == 'E') {
                tmp = 14;
                dec += tmp * Math.pow(16, numHex);
            } else if (hex.charAt(charIdx) == 'f' || hex.charAt(charIdx) == 'F') {
                tmp = 15;
                dec += tmp * Math.pow(16, numHex);
            } else
                dec += Character.getNumericValue(hex.charAt(charIdx)) * Math.pow(16, numHex);
            numHex--;
        }
        System.out.println("The e quivalent decimal number for heximal " + hex + " is: " + dec);
    }

    /*
     * Convert from Octal to Decimal
     */
    public static void oct2Dec(String oct) {
        // Declare variables
        int numOct;
        int dec = 0;

        numOct = oct.length() - 1;
        //
        for (int charIdx = 0; charIdx < oct.length(); charIdx++) {
            //
            if (!Character.isDigit(oct.charAt(charIdx))) {// check is Octal or not
                System.out.println("error");
                System.exit(1);
            }
            dec += Character.getNumericValue(oct.charAt(charIdx)) * Math.pow(8, numOct);
            numOct--;
        }
        System.out.println("The equivalent decimal number " + oct + " is: " + dec);
    }

    // Radix ->Bin
    /*
     * Conver hexcimal to Binary
     */
    public static void hex2Bin(String inStr) {
        // Declare variables
        final String[] HEX_BITS = { "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111" };
        String result = "";

        //
        for (int charIdx = 0; charIdx < inStr.length(); charIdx++) {
            if (Character.isDigit(inStr.charAt(charIdx))) {
                int index = Character.getNumericValue(inStr.charAt(charIdx));
                result = result + HEX_BITS[index] + " ";
            } else if (inStr.charAt(charIdx) == 'A')
                result = result + HEX_BITS[10] + " ";
            else if (inStr.charAt(charIdx) == 'B')
                result = result + HEX_BITS[11] + " ";
            else if (inStr.charAt(charIdx) == 'C')
                result = result + HEX_BITS[12] + " ";
            else if (inStr.charAt(charIdx) == 'D')
                result = result + HEX_BITS[13] + " ";
            else if (inStr.charAt(charIdx) == 'E')
                result = result + HEX_BITS[14] + " ";
            else if (inStr.charAt(charIdx) == 'F')
                result = result + HEX_BITS[15] + " ";
        }

        System.out.print("The equivalent binary for hexadecimal " + inStr + "is: " + result);
    }

    // Radix => Hex
    /*
     * Decimal to Heximal
     */
    public static void dec2Hex(String dec) {
        // Declare variables

        int decimal; // conver from inStr
        String result = "";

        decimal = Integer.valueOf(dec);

        while (decimal > 0) {
            int charHex = decimal % 16;
            if (charHex <= 9)
                result = charHex + result;
            else if (charHex == 10)
                result = "A" + result;
            else if (charHex == 11)
                result = "B" + result;
            else if (charHex == 12)
                result = "C" + result;
            else if (charHex == 13)
                result = "D" + result;
            else if (charHex == 14)
                result = "E" + result;
            else if (charHex == 15)
                result = "F" + result;
            decimal = decimal / 16;
        }

        System.out.print("The equivalent hexadecimal number is: " + result);

    }

    // Radix => Octal

    // MAIN METHOD
    public static void main(String[] args) {
        // Declare variables
        int inRadix;
        int outRadix;
        String inStr;
        Scanner in = new Scanner(System.in);

        // Prompt user
        System.out.print("Enter a number and radix: ");
        inStr = in.next();
        System.out.print("Enter the input radix: ");
        inRadix = in.nextInt();
        System.out.print("Enter the output radix: ");
        outRadix = in.nextInt();

        //
        toRadix(inStr, inRadix, outRadix);

        in.close();
    }
}
