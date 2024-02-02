//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
    	int sym = s.charAt(0) == '-' ? -1 : 1;
    	int i = sym == -1 ? 1 : 0;
    	int num = 0;
    	for(; i < s.length(); i++) {
    	    if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
    	        num = num * 10 + (s.charAt(i) - '0');
    	    else
    	        return -1;
    	}
        return num * sym;
    }
}
