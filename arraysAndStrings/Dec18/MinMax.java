package Dec18;

import java.util.Scanner;

public class MinMax {
    public static int getMin(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    public static int getMax(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be a positive integer.");
            sc.close();
            return;
        }
        arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Minimum: " + getMin(arr));
        System.out.println("Maximum: " + getMax(arr));
        sc.close();
    }
}
