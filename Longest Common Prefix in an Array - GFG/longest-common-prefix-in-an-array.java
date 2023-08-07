//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        boolean isTrue = true;
        String first = arr[0];
        String str = "";

        if(arr.length == 1)
            return arr[0];
            
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            min = Math.min(min, arr[i].length());
        }
        
        for(int i = 0; i < min; i++){
            for(int j = 1; j < arr.length; j++){
                if(i < arr[j].length() && arr[j].charAt(i) != first.charAt(i)){
                    isTrue = false;
                    break;
                }
            }
            if(isTrue == true){
                str += first.charAt(i);
            }
            else{
                i = Integer.MAX_VALUE - 10;
            }
        }
        return str.length() == 0 ? "-1" : str;
    }
}