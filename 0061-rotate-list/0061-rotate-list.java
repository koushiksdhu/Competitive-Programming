/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null)
            return head;
        
        // Brute Force:

        // ListNode temp = head;
        // int size = 0;
        // while(temp != null){
        //     size++;
        //     temp = temp.next;
        // }
        // k = k % size;
        // if(k == 0)
        //     return head;

        // for(int i = 1; i <= k; i++){
        //     ListNode node = head;
        //     while(node.next.next != null){
        //         node = node.next;
        //     }
        //     node.next.next = head;
        //     head = node.next;
        //     node.next = null;
        // }
        // return head;







        // Optimized Approach:

        ListNode tail = head;

        int size = 1;
        while(tail.next != null){
            size++;
            tail = tail.next;
        }

        k = k % size;
        
        if(k == 0)      // if the value of k and length of the linked list is same then return.
            return head;
        
        ListNode rotateNode = head;

        for(int i = 1; i < size-k; i++){
            rotateNode = rotateNode.next;
        }

        tail.next = head;
        head = rotateNode.next;
        rotateNode.next = null;
        return head;
    }
}