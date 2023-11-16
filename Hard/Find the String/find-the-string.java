//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG{
    static class FastReader{ 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader(){ 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next(){ 
            while (st == null || !st.hasMoreElements()){ 
                try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
            } 
            return st.nextToken(); 
        } 
  
        String nextLine(){ 
            String str = ""; 
            try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
            return str; 
        } 

        Integer nextInt(){
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) throws IOException
    {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t-- > 0){
            int N = sc.nextInt(), K = sc.nextInt();
            Solution ob = new Solution();
            String ans = ob.findString(N, K);
            boolean ok = true;
            for(int i = 0; i < ans.length(); i++){
                char c = ans.charAt(i);
                if(c < '0' || c > K - 1 + '0')
                    ok = false;
            }
            if(!ok){
                out.println("-1");
                continue;
            }
            HashSet<String> st = new HashSet<String>();
            for(int i = 0; i + N - 1 < ans.length(); i++){
                st.add(ans.substring(i, i+N));
            }
            int tot = 1;
            for(int i=1;i<=N;i++)
                tot *= K;

            if(st.size() == tot){
                out.println(ans.length());
            }
            else{
                out.println("-1");
            }
        }
        out.flush();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public String findString(int n, int k){
        HashSet<String> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
            sb.append("0");
        hs.add(sb.toString());
        int poss = (int)Math.pow(k, n);
        find(sb, hs, n, k, poss);
        return sb.toString();
    }
    
    boolean find(StringBuilder sb, HashSet<String> hs, int n, int k, int poss) {
        if(hs.size() == poss)
            return true;
        String pre = sb.substring(sb.length() - n + 1);
        for(int i = 0; i < k; i++) {
            String ss = pre + i;
            if(!hs.contains(ss)) {
                hs.add(ss);
                sb.append(i);
                if(find(sb, hs, n, k, poss))
                    return true;
                sb.deleteCharAt(sb.length() - 1);
                hs.remove(ss);
            }
        }
        return false;
    }
}