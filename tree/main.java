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
}
class main
{
    public static void main(String[] args) {
      BinarySearchTree obj=new BinarySearchTree() ;
      System.out.println("root value is "+obj.root);
      
      obj.root=obj.new Node(50);
      System.out.println("root value is "+obj.root.value);
      obj.root.left=obj.new Node(25);
      obj.root.right=obj.new Node(65);
      System.out.println( "  " +  obj.root.value            );
      System.out.print(obj.root.left.value +"  "+ obj.root.right.value );
     


      


    }

}
