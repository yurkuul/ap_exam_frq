/**
 * This question involves the use of check digits, which can be used to help
 * detect if an error has occurred when a number is entered or transmitted
 * electronically. An algorithm for computing a check digit, based on the
 * digits of a number, is provided in part (a). There may be instance
 * variables, constructors, and methods not shown. See document for more
 * details.
 * 
 * @author LZ-FSDev
 * @see https://tinyurl.com/CheckDigitFRQ
 * @since 17.0.1
 * @version 0.0.1
 */
public class CheckDigit {
    public static int getCheck(int num) {
        /* to be implemented in part (a) */
        return 0;
    }

    public static boolean isValid(int num) {
        /* to be implemented in part (b) */
        return false;
    }

    /**
     * Helper method that returns the n'th digit of num where the first digit
     * is n=1.
     * 
     * @param num Number inputted.
     * @param n The location of the number you want to get in num.
     * @return The n'th digit of num.
     * @since 0.0.1
     */
    public static int getDigit(int num, int n) {
        if (num < 0) {
            num *= -1;
        }
        String number = String.valueOf(num);
        number = number.substring(n-1, n);
        return Integer.parseInt(number);
    }

    /**
     * Helper method that returns the number of digits in its int parameter.
     * 
     * @param num Number used to check for the length.
     * @return The length of num.
     * @since 0.0.1
     */
    public static int getNumberOfDigits(int num) {
        int length = 0;
        if (num < 0) {
            num *= -1;
        }
        while (num > 0) {
            length++;
            num /= 10;
        }
        return length;
    }
}
