public class printXpow {
    public static int printXpowerN(int x, int n) {
        // base case
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        // stack height n
        int xPow1 = printXpowerN(x, n - 1);
        int xPow = x * xPow1;
        return xPow;
    }

    public static void main(String[] args) {
        System.out.println(printXpowerN(2, 3));
    }
}
