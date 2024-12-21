import java.util.*;

class binarySearch_01 {
    static int getIndex(int[] arr, int key) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key) {
                result = mid;
                high = mid - 1;// to see the left side for occurences
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        binarySearch_01 obj = new binarySearch_01();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to search in array :");
        int key = sc.nextInt();
        final int result = binarySearch_01.getIndex(arr, key);
        System.out.println("The key is present at index : " + result);
        sc.close();
    }
}