import java.util.*;

public class test2d {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 1, 2, 6, 5 };
        int[][] queries = { { 0, 2 }, { 2, 3 } };
        ArrayList<ArrayList<Integer>> subArrays = new ArrayList<>();
        boolean[] res = new boolean[queries.length];
        ArrayList<Integer> subarray = new ArrayList<Integer>();
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            for (int j = start; j <= end; j++) {
                subarray.add(nums[j]);
            }
            subArrays.add(subarray);
            System.out.println(" ");
        }
        for (ArrayList<Integer> sub : subArrays) {
            // boolean[] res = new boolean[subarray.size() - 1]; // Array to store results
            for (int i = 0; i < sub.size() - 1; i++) { // Iterate up to subarray.size() - 1
                if (sub.get(i) % 2 == 0 && sub.get(i + 1) % 1 == 0) {
                    res[i] = true;
                } else {
                    res[i] = false;
                }
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

class Solution {

    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        ArrayList<Integer> violatingIndices = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            // same parity, found violating index
            if (nums[i] % 2 == nums[i - 1] % 2) {
                violatingIndices.add(i);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int start = query[0];
            int end = query[1];

            boolean foundViolatingIndex = binarySearch(
                    start + 1,
                    end,
                    violatingIndices);

            if (foundViolatingIndex) {
                ans[i] = false;
            } else {
                ans[i] = true;
            }
        }

        return ans;
    }

    private boolean binarySearch(
            int start,
            int end,
            ArrayList<Integer> violatingIndices) {
        int left = 0;
        int right = violatingIndices.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int violatingIndex = violatingIndices.get(mid);

            if (violatingIndex < start) {
                // check right half
                left = mid + 1;
            } else if (violatingIndex > end) {
                // check left half
                right = mid - 1;
            } else {
                // violatingIndex falls in between start and end
                return true;
            }
        }

        return false;
    }
}