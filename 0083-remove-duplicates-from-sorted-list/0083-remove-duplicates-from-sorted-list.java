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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode i = null;
        ListNode j = head;

        while(j != null){
            if(i == null){
                i = j;
                j = j.next;
            }
            else if(i.val == j.val){
                j = j.next;
                i.next = j;
            }
            else{
                i = j;
                j = j.next;
            }
        }
        return head;
    }
}