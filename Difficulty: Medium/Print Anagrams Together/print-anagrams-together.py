#User function Template for python3


class Solution:

    def anagrams(self, arr):
        '''
        words: list of word
        n:      no of words
        return : list of group of anagram {list will be sorted in driver code (not word in grp)}
        '''

        my_dict = {}
        
        for str in arr:
            chr_arr = list(str)
            chr_arr.sort()
            new_str = ''.join(chr_arr)
            
            if new_str not in my_dict:
                my_dict[new_str] = []
            
            my_dict[new_str].append(str)
            
        return list(my_dict.values())
#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for tcs in range(t):
        words = input().split()

        ob = Solution()
        ans = ob.anagrams(words)

        for grp in sorted(ans):
            for word in grp:
                print(word, end=' ')
            print()

        print("~")

# } Driver Code Ends