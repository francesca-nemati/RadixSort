public class Radix {

  public static int nth(int n, int col) {
    int nth;
    col = col + 1;
    nth = n / (int)Math.pow(10, col - 1) % 10;
    return nth;
  }

  public static int length(int n) {
    
  }

}
