//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            



// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){

        int idx = binSearch(arr, x);
        if(idx == -1)
            return new ArrayList<>(Arrays.asList(idx));
        
        int i = idx, j = idx;
        while(i > 0 && arr[i-1] == x)
            i--;
        while(j < arr.length - 1 && arr[j+1] == x)
            j++;
        
        return new ArrayList<>(Arrays.asList(i, j));
    }
    
    int binSearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        
        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == key)
                return mid;
                
            else if(arr[mid] > key)
                end = mid - 1;
            
            else 
                start = mid + 1;
        }
        return -1;
    }
}
