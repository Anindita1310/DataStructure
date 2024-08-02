class main
{
    public static void main(String[]args)
    {
        Stack s=new Stack(4);
        s.push(2);
        s.push(3);
        s.push(11);
        s.printstack();
        //System.out.println(s.getheight());//
       // System.out.println(s.gettop());//
       System.out.println();
       s.pop();
       
       s.printstack();
       System.out.println();
       System.out.println(s.pop().value);




    }
}
class Stack
{
    private Node top;
    private int height;
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
    public Stack(int value)
    {
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }
    public void printstack()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.value+" ");
            temp=temp.next;
        }
    }
    public int getheight()
    {
       return height;
    }
    public int gettop()
    {
        return top.value;
       
    }
    public void push(int value)
    {
        Node newNode=new Node(value);
        if(height==0)
        {
            top=newNode;
        }
        else{
        newNode.next=top;
        top=newNode;
        }
        height++;
    }
    public Node pop()
    {
        if(height==0)return null;
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;

    }
}
