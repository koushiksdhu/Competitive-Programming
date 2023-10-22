//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while(t-- > 0)
        {
            String s;
            s = in.readLine().trim();
            
            Solution ob = new Solution();
            
            out.println(ob.reverseEqn(s));    
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String reverseEqn(String S)
    {
        
        String[] splitSymbols = S.split("[\\Q+*\\E/\\-]");
      Stack<Character> stk = new Stack<>();
      for(int i = 0; i < S.length(); i++){
        if(!Character.isDigit(S.charAt(i)))
          stk.push(S.charAt(i));
      }
      StringBuilder sb = new StringBuilder();
      
      for(int i = splitSymbols.length-1; i >= 0; i--){
        sb.append(splitSymbols[i]);
        if(!stk.isEmpty())
          sb.append(stk.pop());
      }
      return sb.toString();
    }
}