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
        for(int i = 0; i < str.length()-1; i++){
            int temp1 = getNum(str.charAt(i));
            int temp2 = getNum(str.charAt(i+1));
            if(temp1 < temp2)
                ans -= temp1;
            else
                ans += temp1;
        }
        ans += getNum(str.charAt(str.length()-1));
        return ans;
    }
    int getNum(char roman){
        switch(roman){
            case 'M': return 1000;
            case 'D': return 500;
            case 'C': return 100;
            case 'L': return 50;
            case 'X': return 10;
            case 'V': return 5;
            case 'I': return 1;
        }
        return -1;
    }
}