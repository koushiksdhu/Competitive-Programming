//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            
            for(int i = 0; i < n; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    arr[i][j] = Integer.parseInt(s[j]);
                }
            }
            ArrayList<Integer> ans = new Solution().repeatedRows(arr, n, m);
            for(int i=0;i<ans.size();i++)
                System.out.print(ans.get(i)+" ");
                
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<String> al = new ArrayList<>();
        
        for(int i = 0; i < matrix.length; i++) {
            String temp = "";
            for(int j = 0; j < matrix[0].length; j++) {
                temp += ""+matrix[i][j];
            }
            al.add(temp);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < al.size(); i++) {
            for(int j = i + 1; j < al.size(); j++) {
                if(al.get(i).equals(al.get(j))) {
                    ans.add(j);
                    break;
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}