public class slidingWindow {
    static int returnMaxSum(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1;
        }
        int currSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            currSum = currSum + arr[i];
        }
        maxSum = currSum;
        for (int i = k; i < n; i++) {
            currSum = currSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
        int k = 4;
        System.out.println(returnMaxSum(arr, k));
    }
}
