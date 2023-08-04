//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
       char ch[] = line.toCharArray();
       Arrays.sort(ch);
       
        HashMap<Character, Integer> hm = new LinkedHashMap<>();
       
        for(char c : ch)
            hm.put(c, hm.getOrDefault(c, 0)+1);
        
        int max = Integer.MIN_VALUE;
        char temp = 'a';
        for(Map.Entry<Character, Integer> idx : hm.entrySet()){
            if(idx.getValue() > max){
                max = idx.getValue();
                temp = idx.getKey();
            }
        }    
        return temp;
    }
}