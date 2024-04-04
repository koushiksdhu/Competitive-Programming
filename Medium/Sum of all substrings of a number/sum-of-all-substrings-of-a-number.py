#User function Template for python3

class Solution:
    #Function to find sum of all possible substrings of the given string.
    def sumSubstrings(self,s):
        MOD = int(1e9+7)
        dp = [0] * len(s)
        sum = dp[0] = int(s[0])
        for i in range(1, len(s)):
            dp[i] = ((dp[i-1] * 10) % MOD + ((int(s[i])) * (i + 1)) % MOD) % MOD
            sum += dp[i]
        return sum % MOD
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3
import atexit
import io
import sys

import sys
sys.setrecursionlimit(10**6)

# Contributed by : Nagendra Jha

if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        s = str(input())
        ob=Solution()
        print(ob.sumSubstrings(s))
# } Driver Code Ends