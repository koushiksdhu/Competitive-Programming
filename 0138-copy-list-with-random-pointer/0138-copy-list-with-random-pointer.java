/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        // Brute Force using extra space:

        // Node temp =  head;
        // HashMap<Node, Node> hm = new HashMap<>();
        // while(temp != null){
        //     Node newNode = new Node(temp.val);
        //     hm.put(temp, newNode);
        //     temp = temp.next;
        // }

        // temp = head;
        // while(temp != null){
        //     Node n = hm.get(temp);
        //     n.next = hm.get(temp.next);
        //     n.random = hm.get(temp.random);
        //     temp = temp.next;
        // }
        // return hm.get(head);




        // Optimized Approach:

        // Step I: Copying Nodes and its values from the original Linked List:

        if(head == null)
            return head;

        Node temp = head;
        while(temp != null){
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        // Step II: Copying the random pointer link to the new nodes:

        temp = head;
        while(temp != null){
            temp.next.random = temp.random != null ? temp.random.next : null;
            temp = temp.next.next;
        }

        // Step III: Joining back the distorted link of the Original array:

        Node dummy = new Node(-1);
        Node itr = null;
        temp = head;
        dummy.next = temp.next;

        while(temp != null){
            itr = temp.next;
            temp.next = itr.next;
            temp = itr.next;
            itr.next = temp != null ? temp.next : null;
        }

        return dummy.next;

    }
}