/*package whatever //do not write package name here */

import java.util.*;

class Node
{
    int data;
    Node next;
    
    public Node(int x){
        this.data = x;
        this.next = null;
    }
}
class GFG {
    static void printDetails(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        printDetails(head.next);
    }
    static Node insertBegin(Node head, int data){
        Node n = new Node(data);
        n.next = head;
        return n;
    }
    static Node insertEnd(Node head, int data){
        Node temp = new Node(data);
        if(head==null){
            return temp;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        
        return head;
    }
    static Node insertPos(Node head, int data, int pos){
        Node temp = new Node(data);
        if(head == null){
            return temp;
        }
        
        Node temp1 = head;
        if(pos ==1){
            temp.next = temp1;
            return temp;
        }
        for(int i=1;i<pos-1 && temp1!=null;i++){
            temp1 = temp1.next;
        }
        if(temp1==null){
            return head;
        }
        temp.next = temp1.next;
        temp1.next = temp;
        
        
        return head;
    }
	public static void main (String[] args)  {
	    Node head = null;
	    head = insertEnd(head,10);
	    head = insertEnd(head,20);
	    head = insertEnd(head,30);
	    head = insertEnd(head,40);
	    head = insertEnd(head,50);
	    head = insertPos(head,60,70);
	    
	    printDetails(head);
	}
}
