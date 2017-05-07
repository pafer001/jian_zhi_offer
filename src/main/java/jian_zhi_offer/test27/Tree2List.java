package jian_zhi_offer.test27;

import jian_zhi_offer.bean.TreeNode;

public class Tree2List {
	
	
	public TreeNode<Integer> convert(TreeNode<Integer> root) {
		TreeNode<Integer> list  = null;
		
		TreeNode<Integer> head = list;
		
		return head;
	}
	
	public void converNode(TreeNode<Integer> pNode, TreeNode<Integer> list) {
		
		if(pNode == null) {
			return;
		}
		TreeNode<Integer> curNode = pNode;
		
		if(curNode.left != null) {
			converNode(curNode.left, list);
		}
		
		curNode.left = list;
		
		
		
		if(curNode.right != null) {
			converNode(curNode.right, list);
		}
	}
	
	

}
