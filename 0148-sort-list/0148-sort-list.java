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
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null)
            return head;

        ListNode mid = midNode(head);

        ListNode left = head;
        ListNode right = mid.next;
        mid.next = null;

        left = sortList(left);
        right = sortList(right);
        
        ListNode result = merge(left, right);

        return result;
    }

    ListNode midNode(ListNode temp){
        ListNode slow = temp;
        ListNode fast = temp.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ListNode merge(ListNode left, ListNode right){
        if(left == null)
            return right;
        if(right == null)
            return left;

        ListNode temp = new ListNode(-1);
        ListNode answer = temp;

        while(left != null && right != null){
            if(left.val < right.val){
                temp.next = left;
                temp = temp.next;
                left = left.next;
            }
            else{
                temp.next = right;
                temp = temp.next;
                right = right.next;
            }
        }

        while(left != null){
            temp.next = left;
            temp = temp.next;
            left = left.next;
        }

        while(right != null){
            temp.next = right;
            temp = temp.next;
            right = right.next;
        }

        return answer.next;
    }
}