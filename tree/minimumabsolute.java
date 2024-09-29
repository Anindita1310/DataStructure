import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;

    }
}
public class minimumabsolute {
    private List<Integer>values=new ArrayList<>();
    public int getMinimumDifference(Node root){
        inOrder(root);
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<values.size();i++){
            minDiff=Math.min(minDiff,values.get(i)-values.get(i-1));
        }
        return minDiff;


    }
    private void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        values.add(root.data);
        inOrder(root.right);

    }
    public static void main(String[] args) {
        minimumabsolute m=new minimumabsolute();
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(6);
        root.left.left=new Node(1);
        root.left.right=new Node(3);
        System.out.println("Minimum absolute difference is "+m.getMinimumDifference(root));
        
    }
    
}
