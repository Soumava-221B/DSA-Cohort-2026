import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.ArrayList;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {

	  ArrayList<Integer> result = new ArrayList<>();

	  if (root == null) {
		  return result;
	  }

		Queue<BinaryTreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			BinaryTreeNode current = queue.poll();

			result.add((Integer) current.val);

			if (current.left != null) {
				queue.add(current.left);
			}

			if (current.right != null) {
				queue.add(current.right);
			}
		}

		return result;
  }
  }
