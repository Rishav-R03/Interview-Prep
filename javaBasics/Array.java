import java.util.*;

// 2d array here
public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            // rows
            for (int j = 0; j < col; j++) {
                // colmns
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();
        // output matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "\n");
                if (arr[i][j] == x) {
                    System.out.println("x Found at location : (" + i + " " + j + ')');
                }
            }
        }

    }
}