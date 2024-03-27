#User function Template for python3
class Solution:

	def nextGreatest(self,arr, n):

		for i in range(len(arr)-1, 0, -1):
		    if arr[i] > arr[i-1]:
		        arr[i-1] = arr[i]
		arr.append(-1)
        arr.pop(0)
		return arr
		        


#{ 
 # Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ob.nextGreatest(arr, n)
        for x in arr:
            print(x, end=" ")
        print()
        tc -= 1

# } Driver Code Ends