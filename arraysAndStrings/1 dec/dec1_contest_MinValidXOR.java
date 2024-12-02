
// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k;
            k = Integer.parseInt(br.readLine());

            int n;
            n = Integer.parseInt(br.readLine());

            int m;
            m = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.findMax(k, n, m);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

// User function Template for Java