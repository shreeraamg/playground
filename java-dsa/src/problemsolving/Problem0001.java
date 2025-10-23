// Odd or Even
// Using Bitwise Operator instead of modulo is fast & efficient.
// As they operate directly at binary level whereas modulo is arithmetic.
// https://www.geeksforgeeks.org/dsa/check-whether-given-number-even-odd/

package problemsolving;

public class Problem0001 {

    static boolean isEven(int n) {
        return (n & 1) == 0;
    }

    public static void main(String[] args) {
        // Odd or Even
        System.out.println("15: " + isEven(15));
        System.out.println("32: " + isEven(32));
    }

    /*
     * Explanation
     *
     * Number is 32
     *
     * Binary of 32 -- 0 0 1 0 0 0 0 0
     * Binary of  1 -- 0 0 0 0 0 0 0 1
     * AND Operation -----------------
     * Result       -- 0 0 0 0 0 0 0 0
     */

}
