public class merge {
   public static void main(String[]args)
   {
    LinkedList ll=new LinkedList(1);
    ll.append(2);
    ll.append(3);
    
    LinkedList ll1=new LinkedList(4);
    ll1.append(5);
    ll1.append(6);
    ll.merge(ll1);
    ll.printlist();
    

   }
    
}
class LinkedList
{
   private Node head;
    private Node tail;
    private int length;

    class Node
    {
        int value;
        Node next;
        public Node(int value)
        {
            this.value=value;
            this.next=null;
        }
    }
    public LinkedList(int value)
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
    public void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.println(temp.value+" ");
            temp=temp.next;
        }
    }
    public void append(int value)
    {
        Node newNode=new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
            length=1;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void merge(LinkedList otherList)
    {
        Node otherHead=otherList.getHead();
        Node dummy=new Node(0);
        Node current=dummy;
        while(head!=null&&otherHead!=null)
        {
           if(head.value<otherHead.value)
           {
            current.next=head;
            head=head.next;
           }
           else{
            current.next=otherHead;
            otherHead=otherHead.next;
           }
           current=current.next;
        }
        if(head!=null)
        {
            current.next=head;
        }
        else{
            current.next=otherHead;
            tail=otherList.getTail();
        }
        head=dummy.next;
        length+=otherList.getLength();
    }
}
