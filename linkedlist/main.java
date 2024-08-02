class LinkedList
{
    private Node head;
    private Node tail;
    private int length;
    class Node{
        int value;
        Node next;
        public Node(int value)
        {
            this.value=value;
        }
    }
    public LinkedList(int value)
    {
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;

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
        else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
    public Node removelast()
    {
        if(length==0)return null;
        Node temp=head;
        Node prev=head;
        if(length==1)
        {
            head=null;
            tail=null;
        }
      
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        tail=prev;
        tail.next=null;
        length--;
       
        return temp;

        
    }
    public void prepend(int value)
    {
        Node newNode=new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else{
        newNode.next=head;
        head=newNode;
        }
        length++;
    }
    public Node removeFirst()
    {
        if(length==0)return null;
        Node temp=head;
       
        if(length==0)
        {
            head=null;
            tail=null;
        }
        else{
        head=head.next;
        temp.next=null;
        }
        length--;
        return temp;

    }
    public Node get(int index)
    {
        if(index<0||index>=length)return null;
        Node temp=head;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
    public boolean set(int index,int value)
    {
        if(index<0||index>=length)return false;
        Node temp=get(index);
        if(temp!=null)
        {
            temp.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index,int value)
    {
        if(index<0||index>length)return false;
        if(index==0)
        {
            prepend(value);
            return true;
        }
        if(index==length)
        {
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node temp=get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
    }
    public Node remove(int index)
    {
        if(index<0||index>=length)
        return null;
        if(index==0)
        {
            return removeFirst();
        }
        if(index==length-1)
        {
            return removelast();
        }
        Node prev=get(index-1);
        Node temp=prev.next;
        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }
    public void reverse()
    {
        Node temp=head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
        for(int i=0;i<length;i++)
        {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;

        }
    }
    public Node findkthfromend(int k)
    {
        Node fast=head;
        Node slow =head;
        for(int i=0;i<k;i++)
        {
            if(fast==null)
            {
            return null;
            }
            fast=fast.next;

        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

    }
}
class main
{
    public static void main(String[]args)
    {
        LinkedList list=new LinkedList(10);
        list.append(9);
        list.append(5);
        list.append(11);
        //System.out.println(list.removelast().value);
        //System.out.println(list.removelast().value);
       // System.out.println(list.removelast().value);
       // System.out.println(list.removelast().value);
       // System.out.println(list.removelast());
       list.prepend(6);
       System.out.println(list.get(2).value+"\n");
       list.set(1,4);
       list.insert(2,15);
       
       list.printlist();
       System.out.println();
       int k = 2;
       int result = list.findkthfromend(k).value;

       System.out.println(result); // Output: 4

      // System.out.println();
       //list.remove(3);
      // list.printlist();
      // System.out.println("linkedlist after reversal"+"\n");
      // list.reverse();
      // list.printlist();
       //System.out.println(list.removeFirst().value);

    }
}
