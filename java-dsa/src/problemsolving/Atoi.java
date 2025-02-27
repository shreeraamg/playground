package problemsolving;

// ATOI - ASCII to Integer
// https://www.geeksforgeeks.org/write-your-own-atoi/

class Atoi {
  public static void main(String[] args) {
    int res1 = atoi(" -123123");
    System.out.println(res1);
    int res2 = atoi(" -0012gfg4");
    System.out.println(res2);
    int res3 = atoi("  1231231231311133");
    System.out.println(res3);
  }

  static int atoi(String s) {
    int sign = 1, result = 0, index = 0;

    while (index < s.length() && s.charAt(index) == ' ') {
      index++;
    }

    if (index < s.length() && s.charAt(index) == '+' || s.charAt(index) == '-') {
      if (s.charAt(index) == '-')
        sign = -1;
      index++;
    }

    while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
      if (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE / 10 && s.charAt(index) - '0' > 7)
        return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

      result = 10 * result + (s.charAt(index) - '0');
      index++;
    }

    return result * sign;
  }
}