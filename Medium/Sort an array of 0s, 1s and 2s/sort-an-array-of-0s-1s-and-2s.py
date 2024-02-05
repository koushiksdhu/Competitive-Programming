#User function Template for python3

class Solution:
    def sort012(self,arr,n):
        zero = one = two = 0
        for i in arr:
            if i == 0:
                zero += 1
            elif i == 1:
                one += 1
            elif i == 2:
                two += 2
        for i in range(len(arr)):
            if zero > 0:
                arr[i] = 0
                zero -= 1
            elif one > 0:
                arr[i] = 1
                one -= 1
            elif two > 0:
                arr[i] = 2
                two -= 1
        return arr



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t=int(input())
    for _ in range(t):
        n=int(input())
        arr=[int(x) for x in input().strip().split()]
        ob=Solution()
        ob.sort012(arr,n)
        for i in arr:
            print(i, end=' ')
        print()

# } Driver Code Ends