class Solution:
    def findUnique(self, a, n, k): 
        dict = {}
        for i in a:
            if i not in dict:
                dict[i] = 1
            else:
                dict[i] = dict.get(i) + 1
        
        for key, value in dict.items():
            if value % k != 0:
                return key
        return -1


#{ 
 # Driver Code Starts
import sys 

if __name__=='__main__':
    T = int(input())

    for _ in range(T):
        n,k=[int(x) for x in input().split()]
        a = [int(x) for x in input().split()]

        print(Solution().findUnique(a,n,k))
# } Driver Code Ends