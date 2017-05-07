package jian_zhi_offer.test19;

import jian_zhi_offer.bean.TreeNode;

public class MirrorTree {

	public static void main(String[] args) {

	}
	
	
	public static void getMirrorTree(TreeNode<Integer> root) {
		
		if(null == root) {
			return ;
		}
		
		if(null == root.left && null == root.right) {
			return;
		}
		
		TreeNode<Integer> left = root.left;
		root.left = root.right;
		root.right = left;
		getMirrorTree(root.left);
		getMirrorTree(root.right);
	}

}
