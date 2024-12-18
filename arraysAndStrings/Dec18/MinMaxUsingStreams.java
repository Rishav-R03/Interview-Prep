package Dec18;

import java.util.Arrays;
// import java.util.stream.IntStream;

public class MinMaxUsingStreams {
    static int getMin(int[] arr) {
        return Arrays.stream(arr).min().getAsInt();
    }

    static int getMax(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("The minimum element in arrays is: "+getMin(arr));
        System.out.println("The maximum element in array is: "+getMax(arr));
    }
}
