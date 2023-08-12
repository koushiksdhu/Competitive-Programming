//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
    
}
class GFG{
	static void printList(Node node) 
	{ 
		while (node != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
		System.out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution g = new Solution();
            head = g.deleteMid(head);
            printList(head); 
            t--;
        }
    } 
} 
   

// } Driver Code Ends


/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        Node temp = head;
        
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        if(size == 1){
            head = null;
            return head;
        }
        
        int mid  = size/2;
        
        temp = head;
        size = 0;
        while(temp != null){
            size++;
            if(size == mid){
                if(temp.next != null)
                    temp.next = temp.next.next;
                else
                    temp.next = null;
            }
            temp = temp.next;
        }
        return head;
    }
}