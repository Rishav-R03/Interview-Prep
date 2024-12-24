public class firstNegInt {
    static int firstNegative(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1;
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        if (windowSum > 0) {
            return -1;
        }
        int res = 0;
        for (int i = k; i < n; i++) {
            windowSum += arr[i];
            if (windowSum > 0) {
                return i - k + 1;
            }
        }
        return 1;
    }
}
