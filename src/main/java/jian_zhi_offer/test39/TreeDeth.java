package jian_zhi_offer.test39;

import jian_zhi_offer.bean.TreeNode;

public class TreeDeth {

	public static void main(String[] args) {

	}
	
	/**
	 * ��ȡ�������
	 * @param root
	 * @return
	 */
	public static int getTreeDeth(TreeNode<Integer> root) {
		
		if(null == root) {
			return 0;
		}
		
		int leftDeth = getTreeDeth(root.left);
		int rightDeth = getTreeDeth(root.right);
		return (leftDeth > rightDeth ? leftDeth + 1 : rightDeth + 1);
	}
	
	public static boolean isBlancedTree(TreeNode<Integer> root, Integer depth) {

		if (null == root) {
			depth = 0;
			return true;
		}

		Integer leftDepth = 0, rightDepth = 0;

		if (isBlancedTree(root.left, leftDepth)
				&& isBlancedTree(root.right, rightDepth)) {
			int diff = leftDepth - rightDepth;

			if (diff >= -1 && diff <= 1) {
				depth = 1 + (leftDepth > rightDepth ? leftDepth + 1
						: rightDepth + 1);
				return true;
			}
		}

		return false;
	}
	
	public static boolean isBlancedTree(TreeNode<Integer> root) {
		Integer depth = 0;
		return isBlancedTree(root, depth);
	}

}
