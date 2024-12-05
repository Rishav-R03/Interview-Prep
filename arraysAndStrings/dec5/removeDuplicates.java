public class removeDuplicates {
    public static boolean[] map = new boolean[26];

    public static void removingDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(idx);
        if (map[curr - 'a']) {
            removingDuplicates(str, idx + 1, newString);
        } else {
            newString += curr;
            map[curr - 'a'] = true;
            removingDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        removingDuplicates(str, 0, "");
    }
}
