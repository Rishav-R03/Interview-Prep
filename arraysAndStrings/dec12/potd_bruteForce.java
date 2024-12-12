import java.util.*;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length;
        for (int i = 0; i < k; i++) {
            int RichPile = 0;
            for (int currPile = 0; currPile < n; currPile++) {
                if (gifts[RichPile] < gifts[currPile]) {
                    RichPile = currPile;
                }
            }
            gifts[RichPile] = (int) Math.floor(Math.sqrt(gifts[RichPile]));
        }
        long remaining = Arrays.stream(gifts).mapToLong(gift -> gift).sum();
        return remaining;
    }

}