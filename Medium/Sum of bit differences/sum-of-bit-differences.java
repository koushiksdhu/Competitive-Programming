//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().sumBitDifferences(arr, n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    long sumBitDifferences(int[] arr, int n) {
        long sum = 0;
        for(int i = 0; i < 32; i++) {
            long c0 = 0, c1 = 0;
            for(int j = 0; j < arr.length; j++) {
                if((arr[j] & 1) == 0)
                    c0++;
                else
                    c1++;
                arr[j] = arr[j] >> 1;
            }
            sum += 2 * c0 * c1;
        }
        return sum;
    }
}