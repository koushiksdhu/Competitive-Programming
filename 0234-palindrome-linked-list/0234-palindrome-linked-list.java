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
        ArrayList<Integer> al = new ArrayList<>();

        ListNode temp = head;
        while(temp != null){
            al.add(temp.val);
            temp = temp.next;
        }

        return reverse(al);
    }
    boolean reverse(ArrayList<Integer> al){
        int i = 0;
        int j = al.size()-1;

        while(i < j){
            if(al.get(i++) != al.get(j--))
                return false;
        }
        return true;
    }
}