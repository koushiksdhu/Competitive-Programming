class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int ans[] = new int[queries.length];
        int dp[] = new int [words.length];
        int sum = 0;
        for(int i = 0; i < words.length; i++) {
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1)))
                sum++;
            dp[i] = sum;
        }
        for(int i = 0; i < ans.length; i++) {
            if(queries[i][0] == 0)
                ans[i] = dp[queries[i][1]];
            else
                ans[i] = dp[queries[i][1]] - dp[queries[i][0]-1];
        }
        return ans;
    }
    boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
}