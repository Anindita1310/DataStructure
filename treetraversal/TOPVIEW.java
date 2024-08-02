
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class TOPVIEW {
    public static void topView(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        Queue<Integer> hdQueue = new LinkedList<>();
        Map<Integer, Integer> topNodes = new TreeMap<>();
        int minHd = Integer.MAX_VALUE;
        int maxHd = Integer.MIN_VALUE;

        queue.add(root);
        hdQueue.add(0);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            int hd = hdQueue.poll();

            if (!topNodes.containsKey(hd)) {
                topNodes.put(hd, node.data);
            }

            minHd = Math.min(minHd, hd);
            maxHd = Math.max(maxHd, hd);

            if (node.left != null) {
                queue.add(node.left);
                hdQueue.add(hd - 1);
            }

            if (node.right != null) {
                queue.add(node.right);
                hdQueue.add(hd + 1);
            }
        }

        for (int i = minHd; i <= maxHd; i++) {
            System.out.print(topNodes.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        // Constructing a binary tree:
        //         1
        //        / \
        //       2   3
        //      / \   \
        //     4   5   6
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.println("Top view of the binary tree: ");
        topView(root);
    }
}
