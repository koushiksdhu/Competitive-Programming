//{ Driver Code Starts
import java.util.*;

class Distinct_Occurrences
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String S = line.split(" ")[0];
			String T = line.split(" ")[1];
			
			Solution ob = new Solution();
			System.out.println(ob.subsequenceCount(S,T));
			t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete this method*/

class Solution
{
    int  subsequenceCount(String s, String t)
    {
	    int dp[][] = new int[s.length()][t.length()];
	    
	    for(int arr[] : dp)
	        Arrays.fill(arr, -1);
	    
	    return helperFunction(0, 0, s.toCharArray(), t.toCharArray(), dp);
    }
    
    int helperFunction(int i, int j, char s[], char t[], int dp[][]) {
        if(j == t.length)
            return 1;
        if(i == s.length)
            return 0;
            
        if(dp[i][j] != -1)
            return dp[i][j];
        if(s[i] == t[j])
            return dp[i][j] = (helperFunction(i+1, j+1, s, t, dp) + helperFunction(i+1, j, s, t, dp)) % (int)(1e9+7);
            
        return dp[i][j] = helperFunction(i+1, j, s, t, dp);
    }
}