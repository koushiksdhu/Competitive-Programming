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
    public ListNode doubleIt(ListNode head) {
        if(head.val == 0 && head.next == null)
            return head;
        Stack<Integer> stk = new Stack<>();
        ListNode temp = head;
        while(temp != null) {
            stk.push(temp.val);
            temp = temp.next;
        }

        ListNode newList = null;
        int carry = 0;
        while(!stk.isEmpty()) {
            int digit = stk.pop() << 1;
            ListNode newNode = new ListNode(digit % 10 + carry);
            carry = digit / 10;
            newNode.next = newList;
            newList = newNode;
        }
        if(carry > 0) {
            ListNode newNode = new ListNode(carry);
            newNode.next = newList;
            newList = newNode;
        }
        return newList;

    }
}