#User function Template for python3

class Solution:
    def modifyAndRearrangeArr (self, arr,  n) : 
        for i in range(0, len(arr) - 1):
            if arr[i] == arr[i+1] and arr[i] != 0:
                arr[i] *= 2
                arr.pop(i+1)
                arr.append(0)
        i = 0
        count = 0
        while i < len(arr):
            if arr[i] == 0:
                arr.pop(i)
                count += 1
            else:
                i += 1
        arr.extend([0] * count)
        return arr
                
        



#{ 
 # Driver Code Starts
#Initial Template for Python 3

for _ in range(0,int(input())):
    
    n = int(input())
    arr = list(map(int,input().strip().split()))
    ob=Solution()
    ob.modifyAndRearrangeArr(arr, n);
    for i in (arr):
        print(i,end= " ")
    print()




# } Driver Code Ends