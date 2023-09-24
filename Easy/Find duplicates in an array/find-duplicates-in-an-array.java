//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
       ArrayList<Integer> al = new ArrayList<>();
       for(int i : arr){
           hm.put(i, hm.getOrDefault(i, 0) + 1);
       }
       
       for(int i : hm.keySet()){
           if(hm.get(i) > 1)
                al.add(i);
       }
       Collections.sort(al);
       if(al.size() == 0)
            al.add(-1);
       return al;
    }
}
