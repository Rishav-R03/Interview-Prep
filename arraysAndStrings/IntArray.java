//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for (int j = 0; j < s.length; j++) mat[i][j] = Integer.parseInt(s[j]);
        }

        return mat;
    }

    public static void print(int[][] m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (var a : m) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine());

            int k = Integer.parseInt(br.readLine());

            int[][] ops = IntMatrix.input(br, k, 3);

            Solution obj = new Solution();
            int[] res = obj.findArray(n, k, ops);

            IntArray.print(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int[] findArray(int n, int k, int[][] ops) {
        // Create a difference array of size n + 1
        int[] diff = new int[n + 1];
        
        // Process each operation
        for (int[] op : ops) {
            int L = op[0] - 1; // Convert 1-based index to 0-based index
            int R = op[1] - 1; // Convert 1-based index to 0-based index
            int X = op[2];
            
            // Mark the start of the range with XOR
            diff[L] ^= X;
            
            // Mark the end of the range + 1 to reverse the effect after R
            if (R + 1 < n) {
                diff[R + 1] ^= X;
            }
        }
        
        // Construct the result array using prefix XOR
        int[] arr = new int[n];
        int currentXOR = 0;
        for (int i = 0; i < n; i++) {
            currentXOR ^= diff[i];
            arr[i] = currentXOR;
        }
        
        return arr;
    }

    // public static void main(String[] args) {
    //     // Example 1
    //     int n1 = 4, k1 = 3;
    //     int[][] ops1 = {{1, 3, 2}, {2, 4, 4}, {1, 4, 6}};
    //     int[] result1 = findArray(n1, k1, ops1);
    //     System.out.println(java.util.Arrays.toString(result1)); // Output: [4, 0, 0, 2]

    //     // Example 2
    //     int n2 = 6, k2 = 3;
    //     int[][] ops2 = {{2, 3, 5}, {2, 5, 4}, {1, 6, 3}};
    //     int[] result2 = findArray(n2, k2, ops2);
    //     System.out.println(java.util.Arrays.toString(result2)); // Output: [3, 2, 2, 7, 7, 3]
    // }
}