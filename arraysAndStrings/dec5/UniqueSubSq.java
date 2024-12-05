import java.util.*;

public class UniqueSubSq {
    public static void uniqueSubSeq(String Str, int idx, String newString, HashSet<String> set) {
        if (idx == Str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curr = Str.charAt(idx);
        // to be
        uniqueSubSeq(Str, idx + 1, newString + curr, set);
        // or to not be
        uniqueSubSeq(Str, idx + 1, newString, set);
    }

    public static void main(String[] args) {
        String Str = "abba";
        HashSet<String> set = new HashSet<String>();
        uniqueSubSeq(Str, 0, "", set);
    }
}
