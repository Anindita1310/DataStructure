class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
public class balancedTree {
    private Node root;
        public int height(Node root){
            if(root==null){
                return 0;
            }
            return 1+Math.max(height(root.left),height(root.right));
    
        }
        public boolean isBalanced(Node root){
            if(root==null){
                return true;
            }
            int lh,rh;
            lh=height(root.left);
            rh=height(root.right);
            if(Math.abs(lh-rh)<=1 && isBalanced(root.left) &&isBalanced(root.right)){
                return true;
            }
            return false;
        }
        public static void main(String[] args) {
            balancedTree bt=new balancedTree();
            bt.root=new Node(3);
            bt.root.left=new Node(9);
            bt.root.right=new Node(20);
            bt.root.right.left=new Node(15);
            bt.root.right.right=new Node(7);
            if(bt.isBalanced(bt.root)){
                System.out.println("Balanced");
            }else{
                System.out.println("Not Balanced");
            }


        
    }
    
}
