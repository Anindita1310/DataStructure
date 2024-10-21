class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class ValidateBinarySearch {
    public boolean isValidBst(TreeNode root) {
        return isValidBstHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValidBstHelper(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        // Check if the current node's value is within the valid range
        if (node.val <= min || node.val >= max) {
            return false;
        }
        // Recursively check the left and right subtrees with updated ranges
        return isValidBstHelper(node.left, min, node.val) && 
               isValidBstHelper(node.right, node.val, max);
    }

    public static void main(String[] args) {
        ValidateBinarySearch bst = new ValidateBinarySearch();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        boolean res = bst.isValidBst(root);
        System.out.println("Is there a valid BST? " + res);
    }
}
