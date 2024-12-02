
//method 1 : O(n^2)
//check if there is arr[i] = 2*arr[j] such that i!=j and i<j
import java.util.*;

class Solution {

    public boolean checkIfExist(int[] arr) {
        // Step 1: Iterate through all pairs of indices
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                // Step 2: Check the conditions
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        // No valid pair found
        return false;
    }
}
// method 2 : O(n)
// using lookup table or hashmap

class Solution1 {

    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            // Check if 2 * num or num / 2 exists in the set
            if (seen.contains(2 * num) ||
                    (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            // Add the current number to the set
            seen.add(num);
        }
        // No valid pair found
        return false;
    }
}