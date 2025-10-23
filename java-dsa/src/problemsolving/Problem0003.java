// Sum of Digits
// https://www.geeksforgeeks.org/dsa/program-for-sum-of-the-digits-of-a-given-number/

package problemsolving;

public class Problem0003 {

    // Time Complexity -- O(log n)
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    // String Conversion Approach
    // This approach can be used if allowed
    // Time Complexity -- O(n)
    static int sumOfDigitsStringConversion(int n) {
        String s = String.valueOf(n);
        int sum = 0;

        for (char c : s.toCharArray()) {
            sum += c - '0';
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Native Approach: " + sumOfDigits(542));
        System.out.println("String Conversion Approach: " + sumOfDigitsStringConversion(542));
    }

}
