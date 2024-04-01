#User function Template for python3

class Solution:
    def smallestSubstring(self, S):
        zero = one = two = -1
        ans = int(1e9)
        
        for i in range(len(S)):
            if S[i] == "0":
                zero = i
            elif S[i] == "1":
                one = i
            else:
                two = i
                
            if zero != -1 and one != -1 and two != -1:
                max_idx = max(zero, max(one, two))
                min_idx = min(zero, min(one, two))
                ans = min(ans, (max_idx - min_idx + 1))
        return -1 if ans == int(1e9) else ans


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	t=int(input())
	for i in range(t):
		S = input()
		ob = Solution()
		ans = ob.smallestSubstring(S)
		
		print(ans)



# } Driver Code Ends