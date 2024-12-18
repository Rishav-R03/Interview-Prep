package Dec18;

import java.util.*;

public class reverseArray {
    static void reversingArray(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - i - 1];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    static void displayArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reversingArray(arr);
        displayArray(arr);
        sc.close();

    }
}
