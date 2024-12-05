import java.util.*;

public class TowerOfHanoi {
    public static void towerOfHanai(int n, String from, String to, String aux) {
        if (n == 1) {
            System.out.println("Move " + n + " from " + from + " to " + to);
        } else {
            towerOfHanai(n - 1, from, aux, to);
            System.out.println("Move " + n + " from " + from + " to " + to);
            towerOfHanai(n - 1, aux, to, from);
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disks :");
        towerOfHanai(n = sc.nextInt(), "Source", "Help", "Destination");
        sc.close();
    }
}
