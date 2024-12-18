package Dec18;

import java.util.Stack;

class Solution {

    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        // Create a copy of original prices array to store discounted prices
        int[] result = prices.clone();

        for (int i = 0; i < n; i++) {
            // Look for first smaller or equal price that comes after current item
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    // Apply discount by subtracting prices[j] from current price
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }

        return result;
    }

    public int[] finalPricesOne(int[] prices) {
        int res[] = prices.clone();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                res[stack.pop()] -= prices[i];
            }
            stack.add(i);
        }
        return res;
    }

}
