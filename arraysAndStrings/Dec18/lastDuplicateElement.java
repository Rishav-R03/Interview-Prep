package Dec18;

public class lastDuplicateElement {
    static int[] lastDE(int[] arr) {
        int n = arr.length;
        int[] res = new int[2];
        if (arr == null || n <= 0)
            return res;

        // compare elements and return last
        // duplicate and its index
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("Last index:" + i);
                System.out.println("Last duplicate item: "
                        + arr[i]);
                res[0] = i;
                res[1] = arr[i];
                return res;
            }
        }

        // If we reach here, then no duplicate
        // found.
        System.out.print("no duplicate found");
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 5, 5, 7 };
        int[] res = lastDE(arr);
        System.out.println("last index is at: " + res[0]);
        System.out.println("last duplicate element is: " + res[1]);
    }
}
