//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public List<List<String>> Anagrams(String[] str) {
        List<List<String>> al = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i = 0; i < str.length; i++){
            char ch[] = str[i].toCharArray();
            Arrays.sort(ch);
            String temp = String.valueOf(ch);
            if(hm.containsKey(temp)){
                hm.get(temp).add(str[i]);
            }
            else{
                List<String> t = new ArrayList<>(Arrays.asList(str[i]));
                hm.put(temp, t);
            }
        }
        for(List<String> temp : hm.values()){
            al.add(temp);
        }
        return al;
    }
}
