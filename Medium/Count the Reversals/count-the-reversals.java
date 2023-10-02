//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        if(s.length() % 2 == 1)
            return -1;
        
        int count = 0;
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{')
                stk.push('{');
            else if(s.charAt(i) == '}' && !stk.isEmpty() && stk.peek() == '{'){
                stk.pop();
            }
            else{
                stk.push('{');
                count++;
                
            }
        }
        if(stk.size() % 2 != 0)
            return -1;
        return count + stk.size()/2;
    }
}