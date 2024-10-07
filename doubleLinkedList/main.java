#linkedlist
class doubleLinkedlist
{
    private Node head;
    private Node tail;
    private int length;
    class Node
    {
        int data;
        Node next;
        Node prev;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public doubleLinkedlist(int data)
    {
        Node newNode=new Node(data);
        head=newNode;
        tail=newNode;
        length=1;
    }
    public void append(int data)
    {
        Node newNode=new Node(data);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
          tail.next=newNode;
          newNode.prev=tail;
          tail=newNode;
        }
        length++;
    }
    public void printlist()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    
    }
    public void gethead()
    {
       System.out.println(head.data);
    }
    public void gettail()
    {
       System.out.println(tail.data);
    }
    public void getlength()
    {
       System.out.println(length);
    }
    public Node removeLast()
    {
        if(length==0)
        return null;
        Node temp=tail;
        if(length==1)
        {
            head=null;
            tail=null;
        }
        else{
        tail=tail.prev;
        tail.next=null;
        }
        temp.prev=null;
        length--;
        return temp;
    }
    public void prepend(int value)
    {
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }
    public Node removeFirst()
    {
        if(length==0)
        {
            return null;
        }
        Node temp=head;
        if(length==1)
        {
            head=null;
            tail=null;
        }
        else{
        head=head.next;
        head.prev=null;
        temp.next=null;
        }
        length--;
        return temp;
    }
    public Node get(int index)
    {
        if(index<0||index>=length)
        return null;
        Node temp=head;
        if(index<length/2)
        {
           
            for(int i=0;i<index;i++)
            {
                temp=temp.next;
            }
        }
        else{
             temp=tail;
            for(int i=length-1;i>index;i--)
            {
                temp=temp.prev;

            }
        }
        return temp;
        
    }
    public boolean set(int index,int data)
    {
        Node temp=get(index);
        if(temp!=null)
        {
            temp.data=data;
            return true;

        }
        return false;
    }
    public boolean insert(int index,int data)
    {
        if(index<0||index>=length)return false;
        if(index==0)
        {
            prepend(data);
            return true;
        }
        if(index==length)
        {
            append(data);
            return true;
        }
        Node newNode=new Node(data);
        Node before=get(index-1);
        Node after=before.next;
        before.next=newNode;
        newNode.next=after;
        newNode.prev=before;
        after.prev=newNode;
        length++;
        return true;
    }
    public Node remove(int index)
    {
        if(index<0||index>=length)return null;
        if(index==0)
        {
            return removeFirst();
        }
        if(index==length-1)return removeLast();
        Node temp=get(index);
        Node before=temp.prev;
        Node after=temp.next;
        before.next=after;
        after.prev=before;
        
        length--;
        return temp;
    }
    public void swapFirstLast()
	{
	    if(length<2)return;
	    {
	        int temp=head.data;
	        head.data=tail.data;
	        tail.data=temp;
	    }
	}
    public void reverse() {
        Node current = head;
        Node temp = null;
    
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
    
        temp = head;
        head = tail;
        tail = temp;
    }


}
class main
{
    public static void main(String[] args) {
        doubleLinkedlist dll=new doubleLinkedlist(7);
        dll.append(8);
        dll.append(9);
        dll.prepend(6);
        dll.set(1,10);
        dll.insert(3,5);
        dll.printlist();
        System.out.println();
      //  dll.swapFirstLast();
       // dll.printlist();
        dll.reverse();
        dll.printlist();
       // dll.remove(2);
       // System.out.println(dll.get(1).data);
       // System.out.println(dll.get(2).data);
        //System.out.println();
       // dll.printlist();
        
        //System.out.println(dll.removeLast().data);
        //System.out.println(dll.removeLast().data);
       // System.out.println(dll.removeLast());
        System.out.println();
       // System.out.println(dll.removeFirst().data);
        //System.out.println(dll.removeLast().data);

    }
}
