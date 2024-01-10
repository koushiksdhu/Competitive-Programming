//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        Set<String> al = new HashSet<>();
        boolean freq[] = new boolean[S.length()];
        permute(S, al, new StringBuilder(), freq);
        List<String> ans = new ArrayList<>();
        for(String str : al)
            ans.add(str);
        Collections.sort(ans);
        return ans;
        
    }
    void permute(String S, Set<String> al, StringBuilder sb, boolean freq[]) {
        if(sb.length() == S.length()) {
            al.add(sb.toString());
            return;
        }
        
        for(int i = 0; i < S.length(); i++) {
            if(!freq[i]) {
                freq[i] = true;
                sb.append(S.charAt(i));
                permute(S, al, sb, freq);
                sb.deleteCharAt(sb.length() - 1);
                freq[i] = false;
            }
        }
    }
}