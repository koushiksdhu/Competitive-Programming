class Solution {
    public int uniquePaths(int m, int n) {
       // Recursive Call
       int dp[][] = new int[m][n];
       for(int row[] : dp)
            Arrays.fill(row, -1);
       return paths(m, n, 0, 0, dp);
       // Time Complexity/Space Complexity: 2^N if DP not used.
    }

    // Recursive Approach:
    int paths(int m, int n, int i, int j, int dp[][]){
        if(i >= m || j >= n)
            return 0;
        else if(i == m-1 && j == n-1)
            return 1;
        if(dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = paths(m, n, i+1, j, dp) + paths(m, n, i, j+1, dp);
    }
}