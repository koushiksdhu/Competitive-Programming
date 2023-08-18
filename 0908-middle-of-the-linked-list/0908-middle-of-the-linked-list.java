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
    public ListNode middleNode(ListNode head) {
        // ListNode temp = head;
        // int i = 0, j = 0, mid = 0;
        // while(temp != null){
        //     i++;
        //     temp = temp.next;
        // }
        // mid = (i / 2) + 1;
        // temp = head;
        // while(temp != null){
        //     j++;
        //     if(mid == j){
        //         head = temp;
        //         break;
        //     }
        //     temp = temp.next;
        // }
        // return head;

        // Brute Force:

        // ListNode temp = head;
        // int i = 0;
        // while(temp != null){
        //     i++;
        //     temp = temp.next;
        // }
        // int mid = (i/2)+1;
        // temp = head;
        // i = 0;
        // while(temp != null){
        //     i++;
        //     if(i == mid)
        //         return temp;
        //     temp = temp.next;
        // }
        // return temp;

        // Optimized: Using Tortoise Hare Method

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}