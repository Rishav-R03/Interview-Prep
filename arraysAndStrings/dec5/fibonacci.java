public class fibonacci {
    public static void printFibo(int a, int b, int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Print current number
        System.out.print(a + " ");

        // Recursive call with:
        // new a = b
        // new b = a + b
        // n decremented by 1
        printFibo(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        printFibo(0, 1, 5);
    }
}
