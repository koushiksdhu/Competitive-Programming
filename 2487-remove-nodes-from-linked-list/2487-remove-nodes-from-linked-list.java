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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> stk = new Stack<>();

        while(temp != null) {
            while(!stk.isEmpty() && stk.peek().val < temp.val)
                stk.pop();
            stk.push(temp);
            temp = temp.next;
        }
        ListNode newNode = null;
        while(!stk.isEmpty()) {
            temp = stk.pop();
            temp.next = newNode;
            newNode = temp; 
        }
        return temp;
    }
}