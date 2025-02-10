
//Given the head of a singly linked list, reverse the list, and return the reversed list.
//Example 1:
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

public class reverseLinked {
    public static Node reverse(Node head){
        Node prev=null;
        Node next=null;
        Node curr =head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;

    }
    public static void main(String[]args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        Node reversed=reverse(head);
        while(reversed!=null){
            System.out.print(reversed.val);
            reversed=reversed.next;
        }
    }
    
}
