// Sum of n natural numbers
// Formula Derivation: Refer this file -- sum-of-n-natural-numbers.md
// https://www.geeksforgeeks.org/dsa/program-find-sum-first-n-natural-numbers/

package problemsolving;

public class Problem0002 {

    // In this approach we are looping from 1 till n
    // Time Complexity -- O(n)
    static int bruteForce(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // A better approach is to use the mathematical formula
    static int sumOfNaturalNumbers(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println(n);

        // Brute Force
        System.out.println("Brute Force: " + bruteForce(n));

        // Formula
        System.out.println("Formula: " + sumOfNaturalNumbers(n));
    }

}
