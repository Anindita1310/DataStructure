//Write a program to check if a linked list is palindrome or not
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class PalindromeLinkedList {
    public boolean isPalindrome(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node secondhalf=reverse(slow);
        Node firsthalf=head;
        while(secondhalf!=null){
            if(firsthalf.data!=secondhalf.data){
                return false;
            }
            firsthalf=firsthalf.next;
            secondhalf=secondhalf.next;
        }
        return true;
    }
    public Node reverse(Node head){
        Node prev=null;
        Node next=null;
        Node current=head;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public void printlist(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[]args){
        PalindromeLinkedList pl=new PalindromeLinkedList();
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(2);
        head.next.next.next.next=new Node(1);
        pl.printlist(head);
        System.out.println(pl.isPalindrome(head));
    }
    
}
