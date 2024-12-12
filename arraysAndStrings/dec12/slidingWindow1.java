public class slidingWindow1 {
    // bruteforce
    static int bruteForce(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;
        for (int i = 0; i < n - k + 1; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // tc O(n*k) and sc O(1)
    // sliding window
    static int slidingWindow(int[] arr, int k) {
        int n = arr.length;
        int maxSum = 0;
        int windowSum = 0;

        // finding sum of first k elements
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // int n = 5;
        int[] arr = { 3, 4, 2, 4, 5 };
        int k = 2;
        System.out.println(bruteForce(arr, k));
    }
}
