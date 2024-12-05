public class keypadCombi {
    public static String[] keypad = { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void printComb(String str, String comb, int idx) {
        if (idx == str.length()) {
            System.out.println(comb);
            return;
        }
        char curr = str.charAt(idx);
        String map = keypad[curr - '0'];
        for (int i = 0; i < map.length(); i++) {
            printComb(str, comb + map.charAt(i), idx + 1);
        }
    }

    public static void main(String[] args) {
        printComb("23", "", 0);
    }
}
