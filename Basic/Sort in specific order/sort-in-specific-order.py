#User function Template for python3

class Solution:
    def sortIt(self, arr, n):
        odd = []
        even = []
        for i in range(0, len(arr)):
            if arr[i] % 2 == 0:
                even.append(arr[i])
            else:
                odd.append(arr[i])
                
        odd.sort(reverse=True)
        even.sort()
        arr.clear()
        arr.extend(odd + even)
                
                
    



#{ 
 # Driver Code Starts
#Initial Template for Python 3

def main():

    T = int(input())

    while(T > 0):
        n = int(input())
        a = [int(x) for x in input().strip().split()]
        ob = Solution()
        ob.sortIt(a, n)
        print(*a)

        T -= 1


if __name__ == "__main__":
    main()





    
# } Driver Code Ends