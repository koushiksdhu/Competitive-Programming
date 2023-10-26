//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperation(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int minOperation(int n)
    {
        int opr = 0;
        while(n > 0) {
            if(n <= 2) {
                n--;
                opr++;
            }
            else if(n % 2 == 0) {
                n /= 2;
                opr++;
            }
            else if(n/2 != 0) {
                n--;
                opr++;
            }
        }
        return opr;
    }
}