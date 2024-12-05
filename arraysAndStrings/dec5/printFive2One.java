public class printFive2One {
    public static void printNum(int n) {
        // base case
        if (n == 0) {
            return;
        }
        // recursive case
        System.out.println(n);
        printNum(n - 1);
    }

    public static void main(String[] args) {
        //function call
        printNum(5);
    }
}
