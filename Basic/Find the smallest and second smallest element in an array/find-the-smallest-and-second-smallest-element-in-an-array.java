//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            long[] product = obj.minAnd2ndMin(a, n); 
            if(product[0]==-1)
                System.out.println(product[0]);
            else
                System.out.println(product[0]+" "+product[1]);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long ans[] = {-1l, -1l};
        
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        for(long i : a) {
            min1 = Math.min(min1, i);
        }
        for(long i : a) {
            if(i > min1)
                min2 = Math.min(min2, i);
        }
        if(min1 != Long.MAX_VALUE && min2 != Long.MAX_VALUE) {
            ans[0] = min1;
            ans[1] = min2;
        }
        return ans;
    }
}
