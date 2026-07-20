class Solution {

    public TreeNode bstFromPreorder(int[] preorder) {

        TreeNode root = new TreeNode(preorder[0]);

        for (int i = 1; i < preorder.length; i++) {
            insert(root, preorder[i]);
        }

        return root;
    }

    private void insert(TreeNode root, int val) {

        TreeNode curr = root;

        while (true) {

            if (val < curr.val) {

                if (curr.left == null) {
                    curr.left = new TreeNode(val);
                    return;
                }

                curr = curr.left;

            } else {

                if (curr.right == null) {
                    curr.right = new TreeNode(val);
                    return;
                }

                curr = curr.right;
            }
        }
    }
}