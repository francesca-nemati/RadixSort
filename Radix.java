public class Radix {

  public static int nth(int n, int col) {
    int nth;
    col = col + 1;
    n = Math.abs(n);
    nth = n / (int)Math.pow(10, col - 1) % 10;
    return nth;
  }

  public static int length(int n) {
    int len;
    n = Math.abs(n);
    if (n == 0) return 1;
    len = (int)(Math.log10(n) + 1);
    return len;
  }

}
