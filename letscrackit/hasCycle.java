//Given head, the head of a linked list, determine if the linked list has a cycle in it.

//There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

//Return true if there is a cycle in the linked list. Otherwise, return false.
import java.util.*;
class Node{
    int val;
    Node next;
    Node (int val){
        this.val=val;
        this.next=null;
    }
}

public class HasCycle {
    public boolean hasCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                return true;
            }
        }

        return false;
    }
    public static void main(String[]args){
        HasCycle h=new HasCycle();
        Node head=new Node(3);
        head.next=new Node(2);
        head.next.next=new Node(0);
        head.next.next.next=new Node(-4);
        System.out.println(h.hasCycle(head));
    }
    
}
