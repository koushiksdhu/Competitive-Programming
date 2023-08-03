//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
        
        for(int i = 0; i < S.length(); i++){
            hm.put(S.charAt(i), hm.getOrDefault(S.charAt(i), 0)+1);
        }
            
        for(Map.Entry<Character, Integer> idx : hm.entrySet()){
            if(idx.getValue() == 1)
                return idx.getKey();
        }
        return '$';
    }
}

