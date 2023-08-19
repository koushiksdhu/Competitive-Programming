/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Brute Force:

        // HashSet<ListNode> hs = new HashSet<>();

        // ListNode tempA = headA;
        // ListNode tempB = headB;

        // while(tempA != null){
        //     hs.add(tempA);
        //     tempA = tempA.next;
        // }

        // while(tempB != null){
        //     if(hs.contains(tempB))
        //         return tempB;
        //     tempB = tempB.next;
        // }
        // return null;




        // First Optimal Approach:

        // ListNode tempA = headA;
        // ListNode tempB = headB;

        // int sizeA = 0, sizeB = 0;

        // while(tempA != null){
        //     sizeA++;
        //     tempA = tempA.next;
        // }
        // while(tempB != null){
        //     sizeB++;
        //     tempB = tempB.next;
        // }

        // tempA = headA;
        // tempB = headB;
        // int size = Math.abs(sizeA - sizeB);

        // if(sizeA > sizeB){
        //     for(int i = 1; i <= size; i++)
        //         tempA = tempA.next;
        // }
        // else{
        //     for(int i = 1; i <= size; i++)
        //         tempB = tempB.next;
        // }
        // while(tempA != null){
        //     if(tempA == tempB)
        //         return tempA;
        //     tempA = tempA.next;
        //     tempB = tempB.next;
        // }
        // return null;





        // Most Optimal Approach:

        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA != tempB){
            tempA = tempA == null ? headB : tempA.next;
            tempB = tempB == null ? headA : tempB.next;
        }
        return tempA;
    }
}