//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            List<Integer> ans = obj.maxCombinations(n, k, a, b);
            for (int e : ans) System.out.print(e + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static List<Integer> maxCombinations(int N, int K, int A[], int B[]) {
        List<Integer> al = new ArrayList<>();
        Arrays.sort(A);
        Arrays.sort(B);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = N-1; i > N-K-1; i--){
            for(int j = N-1; j > N-K-1; j--){
                if(pq.size() < K)
                    pq.add(A[i] + B[j]);
                else if(pq.peek() < (A[i] + B[j])){
                    pq.poll();
                    pq.add(A[i] + B[j]);
                }
                else
                    break;
                }
            }
        while(!pq.isEmpty()){
            al.add(0, pq.poll());
        }
        return al;
    }
}
