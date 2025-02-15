package dec19;

//Using prefixMax and suffixMin
class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n = arr.length;
        int[] prefixMax = arr.clone();
        int[] suffixMin = arr.clone();
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], prefixMax[i]);
        }
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], suffixMin[i]);
        }
        int chunks = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || suffixMin[i] > prefixMax[i - 1]) {
                chunks++;
            }
        }
        return chunks++;
    }

    // using greedy approach
    public int maxChunksToSorted2(int[] arr) {
        int n = arr.length;
        int count = 0;
        int maxSeen = 0;
        for (int i = 0; i < n; i++) {
            maxSeen = Math.max(maxSeen, arr[i]);
            if (maxSeen == i) {
                count++;
            }
        }
        return count;
    }

    public int maxChunksToSorted3(int[] arr) {
        int n = arr.length;
        int count = 0;
        int preSum = 0;
        int sortedIdx = 0;
        for (int i = 0; i < n; i++) {
            preSum += arr[i];
            sortedIdx += i;
            if (preSum == sortedIdx) {
                count++;
            }
        }

        return count;
    }
}