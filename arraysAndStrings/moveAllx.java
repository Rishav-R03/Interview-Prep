public class moveAllx {
    public static void moveAllX2end(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            System.out.print(newStr);
            for (int i = 0; i < count; i++) {
                System.out.print("x");
            }
            return;
        }

        // String res = " ";
        char curr = str.charAt(idx);
        // int count = 0;
        if (curr == 'x') {
            count++;
            moveAllX2end(str, idx + 1, count, newStr);
        } else {
            newStr += curr;
            moveAllX2end(str, idx + 1, count, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "axxbdxcefxhixmxixjx";
        moveAllX2end(str, 0, 0, "");
    }
}
