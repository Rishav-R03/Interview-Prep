package dec4;

// Make String a Subsequence Using Cyclic Increments - medium
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int str2Ind = 0;
        int leng1 = str1.length();
        int leng2 = str2.length();
        for (int str1Ind = 0; str1Ind < leng1 && str2Ind < leng2; str1Ind++) {
            if (str1.charAt(str1Ind) == str2.charAt(str2Ind) ||
                    (str1.charAt(str1Ind) + 1 == str2.charAt(str2Ind)) ||
                    (str1.charAt(str1Ind) - 25 == str2.charAt(str2Ind))) {
                str2Ind++;
            }
        }
        return str2Ind == leng2;
    }
}