public  class program {
    public static void main(String[]args)
    { 
        Queue q=new Queue(7);
        q.getfirst();
        q.getlast();
        q.getlength();
        q.printqueue();
        System.out.println();
        q.enqueue(2);
        q.enqueue(3);
        q.printqueue();
        System.out.println();
        System.out.println(q.dequeue().value);
        System.out.println(q.dequeue().value);
        


    }
    
}
 class  Queue
{
   private Node first;
   private Node last;
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
   public Queue(int value)
   {
    Node newNode=new Node(value);
    first=newNode;
    last=newNode;
    length=1;

   }
   public void printqueue()
   {
    Node temp=first;
    while(temp!=null)
    {
        System.out.println(temp.value+" ");
        temp=temp.next;
    }

   }
   public void getfirst()
   {
    System.out.println(first.value+" ");
   }
   public void getlast()
   {
    System.out.println(last.value+" ");
   }
   public void getlength()
   {
    System.out.println(length+" ");
   }
   public void enqueue(int value)
   {
    Node newNode=new Node(value);
    if(length==0)
    {
        first=newNode;
        last=newNode;
    }
    else
    {
        last.next=newNode;
        last=newNode;
    }
    length++;
    }
   
   public Node dequeue()
   {
    if(length==0)return null;
    Node temp=first;
    if(length==1)
     {
        first=null;
        last=null;
     }
     first=first.next;
     temp.next=null;
     return temp;
   }
}



