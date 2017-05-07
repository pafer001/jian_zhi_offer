package jian_zhi_offer.test18;

import jian_zhi_offer.bean.TreeNode;

public class SubBinaryTree {

	public boolean hasSubBinaryTree(TreeNode<Integer> root,
			TreeNode<Integer> tree) {

		boolean result = false;

		if (root != null && tree != null) {
			if (root.node == tree.node) {
				result = rootIncludeTree(root, tree);
			}

			if (!result) {
				result = hasSubBinaryTree(root.left, tree);
			}
			if (!result) {
				result = hasSubBinaryTree(root.right, tree);
			}
		}

		return result;
	}

	public boolean rootIncludeTree(TreeNode<Integer> root,
			TreeNode<Integer> tree) {

		if (null == tree) {
			return true;
		}

		if (root.node == tree.node) {
			return rootIncludeTree(root.left, tree.left)
					&& rootIncludeTree(root.right, tree.right);

		} else {
			return false;
		}
	}

}
