package dec6;

public class printAllPer {
    public static void printPermuation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermuation(newString, permutation + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abcd";
        printPermuation(str, "");
    }
}
