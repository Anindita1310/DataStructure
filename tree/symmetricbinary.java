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
public class symmetricbinary {
    public boolean isSymmetric(Node root){
        return isMirror(root,root);
    }
    private boolean isMirror(Node t1,Node t2){
        if(t1==null && t2==null)return true;
        if(t1==null||t2==null){
            return false;
        }
        return(t1.data==t2.data)&&isMirror(t1.left, t2.right)&&isMirror(t2.left, t1.right);
    }
    public static void main(String[] args) {
        symmetricbinary s = new symmetricbinary();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        System.out.println(s.isSymmetric(root));
    



    }
    
}
