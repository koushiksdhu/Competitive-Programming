#User function Template for python3
class Solution:
	def NBitBinary(self, n):
		if n == 1:
		    return "1"
		l = []
		zeroes = 0
		ones = 1
		l = self.helper(n-1, l, 1, zeroes, ones)
		return l
		 
	def helper(self, n, l, num, zeroes, ones):
        if n == 0:
	        if zeroes <= ones:
                l.append(num)
	        return
	    if zeroes <= ones:
	        self.helper(n-1, l, num * 10 + 1, zeroes, ones + 1)
	        self.helper(n-1, l, num * 10 + 0, zeroes + 1, ones)
	    return l
	    


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n = int(input())
		ob = Solution()	
		answer = ob.NBitBinary(n)
		for value in answer:
			print(value,end=" ")
		print()


# } Driver Code Ends