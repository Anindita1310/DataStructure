//Implement an algorithm to find the kth to last element of a single linked list.
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;

    }
}
public class kthtolastelement {
    public static int lastelement(Node head,int k){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data;

    }
    public static void main(String[]args){
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        System.out.println(lastelement(head,2));
        
    }
    
}
