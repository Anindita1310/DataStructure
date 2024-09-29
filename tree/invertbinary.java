class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
      this.data=data;
      this.left=null;
      this.right=null;
    }
}

class invertbinary{
    
    
    public static void invertBinaryTree(Node root){

        if(root == null) return;
        //inverting left right nodes
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        //inverting right and left subtrees
        invertBinaryTree(root.left);
        invertBinaryTree(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Original tree:");
        System.out.println("     1");
        System.out.println("    / \\");
        System.out.println("   2   3");
        System.out.println("  / \\");
        System.out.println(" 4   5");

        // Invert the tree
        invertBinaryTree(root);

        System.out.println("Inverted tree:");
        System.out.println("     1");
        System.out.println("    / \\");
        System.out.println("   3   2");
        System.out.println("    \\ /");
        System.out.println("     5   4");

        


    }
}
