

public class findNumOfPosandNeg {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                neg++;
            } else if (nums[i] > 0) {
                pos++;
            }
        }
        return Math.max(pos, neg);
    }
    
    public static void main(String[] args) {
        findNumOfPosandNeg obj = new findNumOfPosandNeg();
        int[] nums = { -1, -2, 3, 4, 5 };
        int result = obj.maximumCount(nums);
        System.out.println(result);
    }
}
