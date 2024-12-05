public class factorial {
    public static int printFactorial(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // recursive case
        return n * printFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(printFactorial(5));
    }

}
