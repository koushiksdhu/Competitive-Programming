//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int start = sc.nextInt();
            int end = sc.nextInt();

            Solution ob = new Solution();
            int ans = ob.minimumMultiplications(a, start, end);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Pair {
    int step;
    int node;
    
    Pair(int step, int node) {
        this.step = step;
        this.node = node;
    }
}

class Solution {
    int minimumMultiplications(int[] arr, int start, int end) {
        
        if(start == end)
            return 0;
        
        int dist[] = new int[(int)1e5];
        Arrays.fill(dist, (int)1e9);
        dist[start] = 0;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0, start));
        while(!q.isEmpty()) {
            int step = q.peek().step;
            int node = q.peek().node;
            q.poll();
            
            
            for(int i : arr) {
                int num = (i * node) % (int)(1e5);
                if(step + 1 < dist[num]) {
                    dist[num] = step + 1;
                    if(num == end)
                        return step + 1;
                    q.add(new Pair(step+1, num));
                }
            }
        }
        return -1;
    }
}
