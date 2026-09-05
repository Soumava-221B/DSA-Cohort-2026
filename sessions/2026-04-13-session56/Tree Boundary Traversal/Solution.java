/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        if (!isLeaf(root)) {
            result.add(root.data);
        }

        addLeftBoundary(root.left, result);

        addLeaves(root, result);

        ArrayList<Integer> right = new ArrayList<>();
        addRightBoundary(root.right, right);

        for (int i = right.size() - 1; i >= 0; i--) {
            result.add(right.get(i));
        }

        if (isLeaf(root) && result.isEmpty()) {
            result.add(root.data);
        }

        return result;
    }

    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    private void addLeftBoundary(Node node, ArrayList<Integer> result) {
        while (node != null) {
            if (!isLeaf(node)) {
                result.add(node.data);
            }

            if (node.left != null) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    private void addLeaves(Node node, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }

        if (isLeaf(node)) {
            result.add(node.data);
            return;
        }

        addLeaves(node.left, result);
        addLeaves(node.right, result);
    }

    private void addRightBoundary(Node node, ArrayList<Integer> result) {
        while (node != null) {
            if (!isLeaf(node)) {
                result.add(node.data);
            }

            if (node.right != null) {
                node = node.right;
            } else {
                node = node.left;
            }
        }
    }
}