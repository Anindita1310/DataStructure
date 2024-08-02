import java.util.*;
class BinarySearchTree
{
    Node root;
    class Node{
        int value;
        Node left;
        Node right;
        public Node(int value)
        {
            this.value=value;
            left=null;
            right=null;
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
            if(newNode.value==temp.value)return false;
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
        if(root==null)return false;
        Node temp=root;
        if(temp!=null)
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
    public ArrayList<Integer>bfs()
    {
        Node current=root;
        Queue<Node>queue=new LinkedList<>();
        ArrayList<Integer>result=new ArrayList<>();
        queue.add(current);
        while(queue.size()>0)
        {
           current=queue.remove();
           result.add(current.value);
           if(current.left!=null)
           {
            queue.add(current.left);
           }
           if(current.right!=null)
           {
            queue.add(current.right);
           }
        }
        return result;
    }
    public ArrayList<Integer> DfsPostOrder()
    {
        ArrayList<Integer>results=new ArrayList<>();
        class Traverse
        {
            public Traverse(Node currentNode)
            {
                if(currentNode.left!=null)
                {
                    new Traverse(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    new Traverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Traverse(root);
        return results;
    }
    public ArrayList<Integer>DfsPreOrder()
    {
        ArrayList<Integer>results=new ArrayList<>();
        class Traverse
        {
            Traverse(Node currentNode)
            {
                results.add(currentNode.value);
                if(currentNode.left!=null)
                {
                    new Traverse(currentNode.left);
                }
                if(currentNode.right!=null)
                {
                    new Traverse(currentNode.right);
                }
            }
            
        }
        new Traverse(root);
        return results;
    }
    public ArrayList<Integer> dfsInOrder()
    {
        ArrayList<Integer>results=new ArrayList<>();
        class Traverse
        {
            Traverse(Node currentNode)
            {
               
                if(currentNode.left!=null)
                {
                    new Traverse(currentNode.left);
                }
                results.add(currentNode.value);
                if(currentNode.right!=null)
                {
                    new Traverse(currentNode.right);
                }
            }
            
        }
        new Traverse(root);
        return results;
    }
    public boolean isValidBst()
    {
        ArrayList<Integer>nodeValues=dfsInOrder();
        for(int i=1;i<nodeValues.size();i++)
        {
            if(nodeValues.get(i)<=nodeValues.get(i-1))
            {
                return false;
            }
        }
        return true;
    }
     
    public Integer kthSmallest(int k)
    {
        Stack<Node>stack=new Stack<>();
        Node node =this.root;
        while(!stack.isEmpty()||node!=null)
        {
            while(node!=null)
            {
                stack.push(node);
                node=node.left;
            }
            node=stack.pop();
            k-=1;
            if(k==0){
                return node.value;
            }
            node=node.right;
        }
        return null;
    }
}
class main
{
    public static void main(String[]args)
    {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(47);
        
        bst.insert(21);
       
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);
        System.out.println(bst.kthSmallest(3));
        System.out.println(bst.kthSmallest(1));
       
        System.out.println("BFS:"+bst.bfs());
        System.out.println("DFS PRE ORDER:"+bst.DfsPreOrder());
        System.out.println("DFS POST ORDER:"+bst.DfsPostOrder());
        System.out.println("DFS IN ORDER:"+bst.dfsInOrder());


    }
}
