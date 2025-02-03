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
