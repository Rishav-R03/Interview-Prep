import java.util.*;

public class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                i += 2;
            } else {
                return nums[i];
            }
        }
        return nums[i];
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        
        // Test case
        int[] nums = {4, 1, 2, 1, 2};
        
        // Call singleNumber method and print the result
        int result = ob.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
