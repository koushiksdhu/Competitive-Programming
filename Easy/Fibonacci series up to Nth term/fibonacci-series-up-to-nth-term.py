#User function Template for python3

class Solution:
    def series(self, n):
        arr = [0] * (n+1)
        arr[1] = 1
        for i in range(2, len(arr)):
            arr[i] = int((arr[i-1] + arr[i-2]) % (1e9+7))
            
        return arr


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        ob = Solution()
        result = ob.series(N)
        print(*result)
# } Driver Code Ends