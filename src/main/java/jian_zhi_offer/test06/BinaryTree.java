package jian_zhi_offer.test06;


import jian_zhi_offer.bean.TreeNode;

/**
 * 题目描述
 *
 *输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *
 *假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 *输入
 *
 *前序遍历序列{1,2,4,7,3,5,6,8}
 *
 *中序遍历序列{4,7,2,1,5,3,8,6}
 *则重建二叉树并返回。
 * @param <T>
 */
public class BinaryTree<T> {
	
	public static void main(String[] args) {

	}
	
	/**
	 * 
	 * @param array1 前序遍历序列
	 * @param array2 中序遍历序列
	 */
	private void rebulidBinaryTree(int array1[], int array2[]) {
		
		int rootData = array1[0];
		
		int rootIndex = 0;
		while(rootIndex < array2.length && array2[rootIndex++] == rootData);
		
		TreeNode<Integer> root = new TreeNode<Integer>();
//		root.setNode(rootData);
//		root.setLeft(null);
//		root.setRight(null);
		
	}


}
