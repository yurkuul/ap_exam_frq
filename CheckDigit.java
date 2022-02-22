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
 * @version 0.0.2
 */
public class CheckDigit {
    /**
     * Computes the check digit for a number according to the following rules:
     * <ul>
     *  <li>Multiply the first digit by 7, the second digit (if exists) by 6,
     * the third digit (if exists) by 5, and so on. The length of num have a
     * length of 1 to 6 (inclusive).
     *  <li> Add the products calculated in the previous step.
     *  <li>Extract the check digit, which is the right-most digit of the sum
     * calculated in the previous step.
     * </ul>
     * 
     * Example outputs:
     * <ul>
     *  <li>getCheck(283415) -> 6
     *  <li>getCheck(2183) -> 2
     * 
     * @param num The number used for computing according to the rules above.
     * @return The left-most digit of the total given based on the rules above.
     * @since 0.0.2
     */
    public static int getCheck(int num) {
        int total = 0;
        int length = getNumberOfDigits(num);
        int index = 1;
        int multiplier = 7;
        for (int i = 0; i < length; i++) {
            total += getDigit(num, index)*multiplier;
            multiplier--;
            index++;
        }
        return total%10;
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
