//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i = 0; i < str.length(); i++){
            if(!hm.containsKey(str.charAt(i)))
                hm.put(str.charAt(i), i);
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < patt.length(); i++){
            if(hm.containsKey(patt.charAt(i)))
                min = Math.min(hm.get(patt.charAt(i)), min);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}

//{ Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}

// } Driver Code Ends