package jian_zhi_offer.test23;

import jian_zhi_offer.bean.TreeNode;

import java.util.LinkedList;


/**
 * ��α�����
 * @author puffer
 *
 */
public class PrintTreeFromTopToBottom {
	
	

	public static void main(String[] args) {

	}
	
	public static void printTreeFromTopToBottom(TreeNode<Integer> root) {
		
		LinkedList<TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
		queue.addLast(root);
		
		while(!queue.isEmpty()) {
			TreeNode<Integer> node = queue.removeFirst();
			System.out.print(node.node + " ");
			if(node.left != null) {
				queue.addLast(node.left);
			}
			
			if(node.right != null) {
				queue.addLast(node.right);
			}
		}
		
	}
	
}
