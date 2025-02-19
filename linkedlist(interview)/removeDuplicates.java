//Write code to remove duplicates from an unsorted linked list
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class removingDuplicatesfromLinked {
    private Node head;
    public void addNode(int val){
        Node newNode =new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void removeDuplicates(){
        HashSet<Integer>set=new HashSet<>();
        Node curr=head;
        Node prev=null;
        while(curr!=null){
        if(set.contains(curr.val)){
            prev.next=curr.next;
        }
        set.add(curr.val);
        prev=curr;
        curr=curr.next;
    }
    }
    public void printlist(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
        
    }
    public static void main(String[]args){
        removingDuplicatesfromLinked list=new removingDuplicatesfromLinked();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(2);
        list.addNode(4);
        list.addNode(5);
        list.addNode(1);
        list.printlist();
        list.removeDuplicates();
        System.out.println();
        list.printlist();

    }
}
    

