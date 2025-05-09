package problemsolving;

public class Pattern {

    // n represents number of rows
    public static void main(String[] args) {
        pattern3(5);
    }

    /*
     1
     2   3
     4   5   6
     7   8   9   10
     11  12  13  14  15
     */
    static void pattern1() {
        int value = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(value++ + "  ");
            }
            System.out.print("\n");
        }
    }

    /*
          A
        A B A
      A B C B A
     */
    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int midPoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < midPoint) ch++;
                else ch--;
            }

            // This is optional
            for (int j = 1; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /*
     # # # #
     #     #
     #     #
     # # # #
     */
    static void pattern3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print('#');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

}
