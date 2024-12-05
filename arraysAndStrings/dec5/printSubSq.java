public class printSubSq {
    public static void subSeq(String str, int idx, String newString) {
        if (str.length() == idx) {
            System.out.println(newString);
            return;
        }

        char curr = str.charAt(idx);
        // to be
        subSeq(str, idx + 1, newString + curr);
        // or not to be
        subSeq(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subSeq(str, 0, "");
    }
}
