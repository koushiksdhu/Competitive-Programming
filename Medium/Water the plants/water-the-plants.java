//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(in.readLine().trim());
            String s[]=in.readLine().trim().split(" ");
            
            int gallery[] = new int[n];
            for(int i=0; i<n; i++)
                gallery[i] = Integer.parseInt(s[i]);
            Solution T = new Solution();
            out.println(T.min_sprinklers(gallery,n));
        }
		out.close();
		
	}
}





// } Driver Code Ends


//User function Template for Java

class Solution
{
    int min_sprinklers(int gallery[], int n)
    {
        int arr[][] = new int[n][2];
      
        for(int i = 0; i < n; i++) {
            if(gallery[i] == -1)
                continue;
            
            arr[i][0] = i - gallery[i];
            if(arr[i][0] < 0)
                arr[i][0] = 0;
            arr[i][1] = i + gallery[i];
            if(arr[i][1] >= n)
                arr[i][1] = n;
        }
        
        Arrays.sort(arr, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        
        int start = 0, idx = 0, ans = 0;
        int max = Integer.MIN_VALUE;
        
        while(start < n){
            while(idx < n) {
                if(arr[idx][0] > start)
                    break;
                max = Math.max(max, arr[idx][1]);
                idx++;
            }
            
            if(max < start)
                return -1;
            ans++;
            start = max + 1;
        }
        return ans;
    }
}
