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
    public boolean isPalindrome(ListNode head) {

        // Brute Force Approach:

        // StringBuilder sb = new StringBuilder();
        // ListNode temp = head;
        // while(temp != null){
        //     sb.append(temp.val);
        //     temp = temp.next;
        // }

        // return sb.toString().equals(sb.reverse().toString());



        // Optimized Approach:

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow = slow.next;

        ListNode dummy = head;
        while(slow != null){
            if(dummy.val != slow.val)
                return false;
            dummy = dummy.next;
            slow = slow.next;
        }
    return true;
    }
    ListNode reverse(ListNode first){
        ListNode prev = null;
        
        while(first != null){
            ListNode next = first.next;
            first.next = prev;
            prev = first;
            first = next;
        }
        return prev;
    }
}