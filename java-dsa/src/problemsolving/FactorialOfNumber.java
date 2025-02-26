package problemsolving;

// Factorial of Number (Recursion)
// https://www.hackerrank.com/challenges/30-recursion/problem

public class FactorialOfNumber {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    static int factorial(int n) {
        if (n <= 2) {
            return n;
        }

        return n * factorial(n - 1);
    }
}
