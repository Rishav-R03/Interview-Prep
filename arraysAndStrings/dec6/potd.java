package dec6;

import java.util.Arrays;

public class potd {
    class Solution {
        public int maxCount(int[] banned, int n, int maxSum) {
            Arrays.sort(banned); // TC : O(n*logm)
            int banIdx = 0, count = 0;
            for (int num = 1; num <= n && maxSum >= 0; num++) {
                if (banIdx < banned.length && banned[banIdx] == num) {
                    while (banIdx < banned.length && banned[banIdx] == num) {
                        banIdx++;
                    }
                } else {
                    maxSum -= num;
                    if (maxSum >= 0) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
