//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        int ans = 0;
        for(int i = 0; i < str.length(); i++){
            if(i < str.length()-1){
                if(value(str.charAt(i)) < value(str.charAt(i+1)))
                    ans -= value(str.charAt(i));
                else
                    ans += value(str.charAt(i));
            }
            else
                ans += value(str.charAt(i));
        }
        return ans;
        
    }
    int value(char ch){
        int ans = 0;
        switch(ch){
            case 'I': ans = 1;
                break;
            case 'V': ans = 5;
                break;
            case 'X': ans = 10;
                break;
            case 'L': ans = 50;
                break;
            case 'C': ans = 100;
                break;
            case 'D': ans = 500;
                break;
            case 'M': ans = 1000;
                break;
        }
        return ans;
    }
}