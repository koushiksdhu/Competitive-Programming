
class Solution:
    def countWays(self, s1 : str, s2 : str) -> int:
        MOD = int(1e9 + 7)
        dp = [1] * (len(s1) + 1)
        
        for i in range(1, len(s2) + 1):
            n_dp = [0] * (len(s1) + 1)
            for j in range(1, len(s1) + 1):
                n_dp[j] = n_dp[j-1]
                if s2[i-1] == s1[j-1]:
                    n_dp[j] = (n_dp[j] + dp[j-1]) % MOD
            dp = n_dp
        return dp[len(s1)]
        



#{ 
 # Driver Code Starts
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):

        s1 = (input())

        s2 = (input())

        obj = Solution()
        res = obj.countWays(s1, s2)

        print(res)

# } Driver Code Ends