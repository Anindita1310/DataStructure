class BinarySearchTree
{
    Node root;
    class Node
    {
        int value;
        Node left,right;
        public Node(int value)
        {
            this.value=value;
            left=right=null;
        }
    }
    public boolean insert(int value)
    {
        Node newNode=new Node(value);
        if(root==null)
        {
            root=newNode;
            return true;
        }
        Node temp=root;
        while(true)
        {
            if(newNode.value==temp.value)
            return false;
            if(newNode.value<temp.value)
            {
                if(temp.left==null)
                {
                temp.left=newNode;
                return true;
                }
                temp=temp.left;
            }
           else
           {
            if(temp.right==null)
            {
                temp.right=newNode;
                return true;
            }
            temp=temp.right;
           }
        }
    }
    public boolean contains(int value)
    {
        if(root==null)
        return false;
        Node temp=root;
        while(temp!=null)
        {
            if(value<temp.value)
            {
            temp=temp.left;
            }
           else if(value>temp.value)
            {
            temp=temp.right;
            }
           else
           {
            return true;
           }
           
        }
        return false;
    }
}

public class main2 {
    public static void main(String[]args)
    {
      BinarySearchTree obj=new BinarySearchTree();
      obj.insert(47);
      obj.insert(21);
      obj.insert(56);
      obj.insert(20);
      obj.insert(34);
      obj.insert(51);
      obj.insert(64);
      System.out.println(obj.root.left.right.value);
      obj.contains(56);
      obj.contains(35);
    }
    
}
