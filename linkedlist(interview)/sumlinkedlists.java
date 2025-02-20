//You have two numbers represented by a linked list,where each node contains a single digit.The digit are stored in reverse order,such that 1's digit at head of the list.
//Write a function that adds two numbers and returns the sum as a linked list.
//Input 7->1->6 +(5->9->2)
//Output:2->1->9
class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next=null;
    }   
}


public class sumLists {
    public Node addtwoLists(Node l1,Node l2){
        Node dummy=new Node(0);
        Node current=dummy;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
            int x=(l1!=null)?l1.data:0;
            int y=(l2!=null)?l2.data:0;
            int sum=x+y+carry;
            carry=sum/10;
            current.next=new Node(sum%10);
            current=current.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
        }
        return dummy.next;
    }
    public static void main(String[]args){
        sumLists sl=new sumLists();
        Node l1=new Node(7);
        l1.next=new Node(1);
        l1.next.next=new Node(6);
        Node l2=new Node(5);
        l2.next=new Node(9);
        l2.next.next=new Node(2);
        Node res=sl.addtwoLists(l1,l2);
        while(res!=null){
            System.out.print(res.data+"->");
            res=res.next;
        }
        System.out.println("NULL");

    }
    
}
