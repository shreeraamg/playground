package recursion;

public class Lecture2 {
    public static void main(String[] args) {
        System.out.println("Print Ascending: 1 to 5 (Backtracking)");
        printAscending(5);
        System.out.println("========================");
        System.out.println("Print Descending 5 to 1 (Recursion)");
        printDescending(5);
        System.out.println("========================");
        System.out.println("Print Descending 5 to 1 (Backtracking)");
        printDescending(1, 5);
    }

    // Print from 1 till N
    // This approach is backtracking
    static void printAscending(int n) {
        if (n < 1)
            return;

        printAscending(n - 1);
        System.out.println(n);
    }

    // Print from N till 1
    static void printDescending(int n) {
        if (n < 1)
            return;

        System.out.println(n);
        printDescending(n - 1);
    }

    // Print from N till 1 (In backtracking)
    static void printDescending(int i, int n) {
        if (i > n) return;

        printDescending(i + 1, n);
        System.out.println(i);
    }
}
