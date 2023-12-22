//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N; 
            N = Integer.parseInt(br.readLine());
            
            
            int[] S = IntArray.input(br, N);
            
            
            int[] F = IntArray.input(br, N);
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.maxMeetings(N, S, F);
            
            IntArray.print(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> maxMeetings(int N, int[] S, int[] F) {
        ArrayList<Integer> al = new ArrayList<>();
        Pair p[] = new Pair[N];
        
        for(int i = 0; i < N; i++) {
            p[i] = new Pair(i+1, S[i], F[i]);
        }
        
        Arrays.sort(p, (a, b) -> a.end - b.end);
        int end = -1;
        for(int i = 0; i < N; i++) {
            if(p[i].start > end) {
                al.add(p[i].idx);
                end = p[i].end;
            }
        }
        Collections.sort(al);
        return al;
    }
}

class Pair {
    int idx, start, end;
    Pair(int idx, int start, int end) {
        this.idx = idx;
        this.start = start;
        this.end = end;
    }
}
        
