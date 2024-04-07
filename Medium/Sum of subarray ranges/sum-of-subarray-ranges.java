//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] arr = new int[N];
            for (int i = 0; i < N; i++) arr[i] = sc.nextInt();

            Solution obj = new Solution();
            long res = obj.subarrayRanges(N, arr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static long subarrayRanges(int N, int[] arr) {
        long sum = 0;
        
        for(int i = 0; i < N; i++) {
            int min = arr[i];
            int max = arr[i];
            for(int j = i; j < N; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
                sum += max - min;
            }
        }
        return sum;
    }
}
