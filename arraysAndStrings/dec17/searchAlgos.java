import java.util.*;

public class searchAlgos {
    static int linearSearch(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int n = 5;
        int arr[] = { 2, 4, 5, 6, 7, 1 };
        int key = 1;
        int resultLinear = linearSearch(arr, key);
        int resultBinary = binarySearch(arr, key);
        System.out.println(resultLinear);
        System.out.println(resultBinary);
    }
}
