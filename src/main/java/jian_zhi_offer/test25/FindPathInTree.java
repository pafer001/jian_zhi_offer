package jian_zhi_offer.test25;

import jian_zhi_offer.bean.TreeNode;

import java.util.LinkedList;

public class FindPathInTree {

	public static void main(String[] args) {
		
	}
	
	public static void findPathInTree(TreeNode<Integer> node, Integer data,
			LinkedList<TreeNode<Integer>> stack, Integer curData) {

		if (node.left == null && node.right == null) {
			if (curData == data) {
				printStackFromHeadToEnd(stack);
			}
			stack.pop();
			return ;
		} else if (node.left != null) {
			curData += node.left.node;
			stack.push(node.left);
			findPathInTree(node.left, data, stack, curData);
		} else if (node.right != null) {
			curData += node.left.node;
			stack.push(node.right);
			findPathInTree(node.right, data, stack, curData);
		}
	}
	
	public static void printStackFromHeadToEnd(LinkedList<TreeNode<Integer>> stack) {
		
		for(TreeNode<Integer> node : stack) {
			System.out.print(node.node);
		}
		
		System.out.println();
	}

}
