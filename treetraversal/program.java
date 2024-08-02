//recursive binary Search Tree
public class program {
    public static void main(String[]args)
    {
        Tree tree=new Tree();
        tree.rinsert(2);
        tree.rinsert(1);
        tree.rinsert(3);
        System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right.value);
        System.out.println();
        tree.deleteNode(2);
        System.out.println(tree.root.value);
        System.out.println(tree.root.left.value);
        System.out.println(tree.root.right);


        //tree.rinsert(18);
       // tree.rinsert(27);
        //tree.rinsert(52);
        //tree.rinsert(82);

       // System.out.println(" 47 contains");
       // System.out.println(tree.rcontains(47));
       // System.out.println("4 contains");
       // System.out.println(tree.rcontains(4));
       // System.out.println(tree.minvalue(tree.root));
      //  System.out.println(tree.minvalue(tree.root.right));

       
    }
    
}
 class Tree
{
    Node root;
    class Node
    {
        int value;
        Node left;
        Node right;
        public Node(int value)
        {
            this.value=value;
            this.left=null;
            this.right=null;
        }

    }
    public boolean rcontains(Node currentNode,int value)
    {
        if(currentNode==null)return false;
        if(currentNode.value==value)
        {
            return true;
        }
        if(value<currentNode.value)
        {
            return rcontains(currentNode.left,value);
        }
        else{
            return rcontains(currentNode.right,value);
        }
    }
    public boolean rcontains(int value)
    {
        return rcontains(root,value);
    }
    public Node rinsert(Node currentNode,int value)
    {
        if(currentNode==null)return new Node(value);
        if(value<currentNode.value)
        {
            currentNode.left=rinsert(currentNode.left,value);
        }
        else if(value>currentNode.value)
        {
            currentNode.right=rinsert(currentNode.right,value);
        }
        return currentNode;

    }
    public void rinsert(int value)
    {
        if(root==null)
        {
            root=new Node(value);
        }
        rinsert(root,value);
    }
    private Node deleteNode(Node currentNode,int value)

    {
        if(currentNode==null)return null;
        if(value<currentNode.value)
        {
            currentNode.left=deleteNode(currentNode.left,value);
        }
        else if(value>currentNode.value)
        {
            currentNode.right=deleteNode(currentNode.right,value);
        }
        else{
            if(currentNode.left==null||currentNode.right==null)
            //node is a leaf node
            return null;
            else if(currentNode.right==null)//when the node does not have right child
            {
                currentNode=currentNode.left;
            }
            else if(currentNode.left==null)//when the node does not have left child
            {
                currentNode=currentNode.right;
            }
            else{
                int subtree=minvalue(currentNode.right);
                currentNode.value=subtree;
                currentNode.right=deleteNode(currentNode.right,subtree);

            }


        }
        return currentNode;

    }
    public void deleteNode(int value)
    {
        deleteNode(root,value);
    }
    public int minvalue(Node currentNode)
    {
        while(currentNode.left!=null)
        {
            currentNode=currentNode.left;
        }
        return currentNode.value;
    }
}

