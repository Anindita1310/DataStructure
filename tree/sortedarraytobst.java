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

public class sortedarraytobst {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        // Corrected base case
        if (left > right) {
            return null;
        }
        int middleNode = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[middleNode]);
        root.left = buildTree(nums, left, middleNode - 1);
        root.right = buildTree(nums, middleNode + 1, right);
        return root;
    }

    public void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " "); // Changed println to print for better formatting
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        sortedarraytobst bst = new sortedarraytobst();
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = bst.sortedArrayToBST(nums);
        System.out.println("PreOrder Traversal of the BST:");
        bst.preOrderTraversal(root);
    }
}
