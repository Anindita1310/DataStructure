//Implement a algorithm to delete a node in the middle
class Node{
    String val;
    Node next;
   public  Node(String val){
        this.val=val;
        this.next=null;
    }
}


public class deleteamiddleNode {
   
    public static void deleteamiddleNode(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
    }
    public static void main(String[]args){
        deleteamiddleNode list = new deleteamiddleNode();
        Node head = new Node("a");
        head.next = new Node("b");
        head.next.next = new Node("c");
        head.next.next.next = new Node("d");
        head.next.next.next.next = new Node("e");
        deleteamiddleNode(head);
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
       
    }

    
}
