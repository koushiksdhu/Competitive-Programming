#User function Template for python3

"""
# Node Class

class Node:
    def __init__(self, val):
        self.data = val
        self.next = None

"""

class Solution:
    #Function to reverse a linked list.
    def arrangeCV(self, head):
        cons = []
        vow = []
        
        tmp = head
        
        while tmp:
            if tmp.data in ['a', 'e', 'i', 'o', 'u']:
                vow.append(tmp.data)
            else:
                cons.append(tmp.data)
            tmp = tmp.next
                    
        tmp = head
        for i in vow:
            tmp.data = i
            tmp = tmp.next
        for i in cons:
            tmp.data = i
            tmp = tmp.next
            
        return head
            
        


#{ 
 # Driver Code Starts
# Node Class
class Node:

    def __init__(self, val):
        self.data = val
        self.next = None


# Linked List Class
class Linked_List:

    def __init__(self):
        self.head = None
        self.tail = None

    def insert(self, val):
        if self.head is None:
            self.head = Node(val)
            self.tail = self.head
        else:
            self.tail.next = Node(val)
            self.tail = self.tail.next


def printList(head):
    tmp = head
    while tmp:
        print(tmp.data, end=' ')
        tmp = tmp.next
    print()


if __name__ == '__main__':
    for i in range(int(input())):
        n = int(input())
        arr = [str(x) for x in input().split()]

        lis = Linked_List()
        for i in arr:
            lis.insert(i)

        newHead = Solution().arrangeCV(lis.head)
        printList(newHead)

# } Driver Code Ends