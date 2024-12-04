package dec3;

public class Recursion {
    public static void printTentoOne(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.println(n);
            printTentoOne(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printTentoOne(n);
    }
}
