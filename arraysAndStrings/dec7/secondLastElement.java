import java.util.*;

public class secondLastElement {
    static int find2ndLargest(int[] arr) {
        Arrays.sort(arr); // tc O(nlogn) and sc O(1)
        int n = arr.length; // size of array
        for (int i = (n - 2); i >= 0; i--) { // start from third last to 1st element to see if it is unique
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        return -1; // if all elements are same
    }

    static int find2ndLargest2(int[] arr) { // better approach using two traversals
        int largest = -1, secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice of method naive or better :");
        System.out.println("Press 1 for naive and 2 for better :");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("You chose naive method. Enter the size of array :");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of array :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(find2ndLargest(arr));
        } else if (choice == 2) {
            System.out.println("You chose better method. Enter the size of array :");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of array :");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(find2ndLargest2(arr));
        }

        sc.close();
    }
}
