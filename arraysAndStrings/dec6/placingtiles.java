package dec6;

public class placingtiles {
    public static int placeTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }

        int verPlace = placeTiles(n - m, m);
        int horiPlace = placeTiles(n - 1, m);
        return verPlace + horiPlace;
    }

    public static void main(String args[]) {
        int n = 4, m = 2;
        System.out.println(placeTiles(n, m));
    }
}
