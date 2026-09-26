/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    class Info {
        boolean isBST;
        int min;
        int max;
        int sum;

        Info(boolean isBST, int min, int max, int sum) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
            this.sum = sum;
        }
    }

    class Pair {
        TreeNode node;
        boolean visited;

        Pair(TreeNode node, boolean visited) {
            this.node = node;
            this.visited = visited;
        }
    }

    public int maxSumBST(TreeNode root) {

        if (root == null)
            return 0;

        int ans = 0;

        Stack<Pair> stack = new Stack<>();
        HashMap<TreeNode, Info> map = new HashMap<>();

        stack.push(new Pair(root, false));

        while (!stack.isEmpty()) {

            Pair curr = stack.pop();

            if (curr.node == null)
                continue;

            if (!curr.visited) {

                // Postorder: Left -> Right -> Node
                stack.push(new Pair(curr.node, true));
                stack.push(new Pair(curr.node.right, false));
                stack.push(new Pair(curr.node.left, false));

            } else {

                Info left = map.getOrDefault(
                        curr.node.left,
                        new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0)
                );

                Info right = map.getOrDefault(
                        curr.node.right,
                        new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0)
                );

                if (left.isBST &&
                    right.isBST &&
                    curr.node.val > left.max &&
                    curr.node.val < right.min) {

                    int sum = left.sum + right.sum + curr.node.val;

                    ans = Math.max(ans, sum);

                    map.put(curr.node,
                            new Info(
                                    true,
                                    Math.min(left.min, curr.node.val),
                                    Math.max(right.max, curr.node.val),
                                    sum
                            ));

                } else {

                    map.put(curr.node,
                            new Info(false, 0, 0, 0));
                }
            }
        }

        return ans;
    }
}