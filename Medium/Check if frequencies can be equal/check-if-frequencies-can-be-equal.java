//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean sameFreq(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(char ch : s.toCharArray())
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(Map.Entry<Character, Integer> idx : hm.entrySet()) {
            min = Math.min(idx.getValue(), min);
            max = Math.max(idx.getValue(), max);
            hm2.put(idx.getValue(), hm2.getOrDefault(idx.getValue(), 0) + 1);
        }
        
        if(hm2.size() > 2)
            return false;
            
        if(max > min && hm2.get(max) > 1 && min == 1)
            return true;
            
        if(max > min && hm2.get(max) > 1 && min > 1)
            return false;
            
        if(min == max || max == min+1)
            return true;
            
        return false;
    }
}