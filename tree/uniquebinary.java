class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) return new ArrayList<>();
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new ArrayList<>();
        
        if (start > end) {
            allTrees.add(null); // Adding null for the empty subtree
            return allTrees;
        }

        for (int i = start; i <= end; i++) {
            // Generate all left and right subtrees
            List<TreeNode> leftTrees = generateTrees(start, i - 1);
            List<TreeNode> rightTrees = generateTrees(i + 1, end);

            // Combine left and right subtrees with the current root
            for (TreeNode left : leftTrees) {
                for (TreeNode right : rightTrees) {
                    TreeNode currentNode = new TreeNode(i);
                    currentNode.left = left;
                    currentNode.right = right;
                    allTrees.add(currentNode);
                }
            }
        }
        return allTrees;
    }
}
