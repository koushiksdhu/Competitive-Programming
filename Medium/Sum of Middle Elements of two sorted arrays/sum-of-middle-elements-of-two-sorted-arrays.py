#User function Template for python3

class Solution:
	def findMidSum(self, ar1, ar2, n): 
		l = []
		
		i = 0
		j = 0
		
		while i < n and j < n:
		    if ar1[i] <= ar2[j]:
		        l.append(ar1[i])
		        i += 1
		    else:
		        l.append(ar2[j])
		        j += 1
		while i < n:
		    l.append(ar1[i])
		    i += 1
		
		while j < n:
		    l.append(ar2[j])
		    j += 1
		    
		mid = len(l) // 2
		return l[mid-1] + l[mid]


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__": 		
    tc=int(input())
    while tc > 0:
        n=int(input())
        ar1=list(map(int, input().strip().split()))
        ar2=list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.findMidSum(ar1, ar2, n)
        print(ans)
        tc=tc-1

# } Driver Code Ends