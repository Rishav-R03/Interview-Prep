import java.util.*;

public class Strbuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);
        char x = sb.charAt(3);
        System.out.println(x);
        sb.deleteCharAt(3);
        System.out.println(sb);
        sb.insert(3, "no");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.setCharAt(3, 'N');
        System.out.println(sb);
    }
}
