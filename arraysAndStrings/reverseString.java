import java.util.*;

public class reverseString {
    public static void printRev(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx) + " ");
        printRev(str, idx - 1);
    }

    public static void main(String[] args) {

        String str;
        System.err.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        printRev(str, str.length() - 1);
        sc.close();
    }
}
