/* class Node {
    int data;
    Node left, right;
    public Node(int d) {
     data = d;
     left = right = null;
   }
} */

class Solution {

    static class Info {
        int size;      
        int min;       
        int max;       
        int ans;
        boolean isBST;

        Info(int size, int min, int max, int ans, boolean isBST) {
            this.size = size;
            this.min = min;
            this.max = max;
            this.ans = ans;
            this.isBST = isBST;
        }
    }

    static int largestBst(Node root) {
        return solve(root).ans;
    }

    static Info solve(Node root) {

        if (root == null) {
            return new Info(0, Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
        }

        Info left = solve(root.left);
        Info right = solve(root.right);

        if (left.isBST && right.isBST &&
            left.max < root.data &&
            right.min > root.data) {

            int size = left.size + right.size + 1;

            int minValue = Math.min(left.min, root.data);
            int maxValue = Math.max(right.max, root.data);

            return new Info(
                size,
                minValue,
                maxValue,
                size,
                true
            );
        }

        return new Info(
            0,
            Integer.MIN_VALUE,
            Integer.MAX_VALUE,
            Math.max(left.ans, right.ans),
            false
        );
    }
}