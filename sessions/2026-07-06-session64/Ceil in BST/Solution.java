/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        if (root == null) {
            return -1;
        }
        
        int ceil = -1;
        
        while (root != null) {
            if (root.data == x) {
                return root.data;
            }
            
            if (root.data > x) {
                ceil = root.data;
                root = root.left;
            }
            
            else {
                root = root.right;
            }
        }
        return ceil;
    }
}