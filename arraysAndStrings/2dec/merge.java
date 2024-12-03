
// package 2dec;
import java.util.*;

public class merge {
    public static int[] mergeArray(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] res = new int[n + m];
        for (int i = 0; i < n; i++) {
            res[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            res[n + i] = b[i];
        }
        Arrays.sort(res);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println("Enter size of array 1 : ");
        int[] arr1 = new int[n];
        System.out.println("Enter size of array 1 : ");
        int[] arr2 = new int[n];
        System.out.println("Enter elements of array 1 : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of array 2 : ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        merge ob = new merge();

    }
}

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n);
        Arrays.sort(nums1);
    }
}
