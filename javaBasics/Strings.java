import java.util.*;

class Strings {
    public static void main(String args[]) {
        // String s1 = new String("Hello");
        // String s2 = "Hello";

        // System.out.println(s1);
        // System.out.println(s2);
        Scanner sc = new Scanner(System.in);
        String s1;
        String s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.println(s1 + " " + s2);

        // concatenation
        /*
         * add string : +
         * multiply string : *
         * length of string : .length
         * substring : .substring(start, end)
         * split : .split("delimiter")
         * replace : .replace(old, new)
         * equals : .equals
         * compare : .compareTo : checks 3 cases 1. s1 > s2(+1) 2. s1 < s2(-1) 3. s1
         * ==s2(0)
         * contains : .contains
         * charAt : .charAt
         */
        System.out.println(s1.equals(s2));
        System.out.println(s1.length());
        System.out.println(s2.length());
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        
    }
}