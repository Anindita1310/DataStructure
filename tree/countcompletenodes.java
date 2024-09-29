class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data = data;
        this.right=null;
        this.left=null;
    }
}
public class countcompletenodes {
    public static int countCompleteNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int nl=countCompleteNodes(root.left);
        int nr=countCompleteNodes(root.right);
        return 1+nl+nr;
    }
    public static void main(String[]args){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        System.out.println("No of complete nodes is "+countCompleteNodes(root));
        



    }
    
}
