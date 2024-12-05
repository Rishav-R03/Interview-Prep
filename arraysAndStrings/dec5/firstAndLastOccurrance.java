public class firstAndLastOccurrance {
    public static int first = -1, last = -1;

    public static void findOccurance(String str, int idx, int element) {
        if (idx == str.length()) {
            System.out.println("The char was first found at index " + first);
            System.out.println("The char was last found at index " + last);
            // System.out.println(last);
            return;
        }
        char curr = str.charAt(idx);
        if (curr == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOccurance(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        findOccurance(str, 0, 'e');
    }
}
