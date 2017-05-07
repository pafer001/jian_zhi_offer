package jian_zhi_offer.test06;


import jian_zhi_offer.bean.TreeNode;

public class BinaryTree<T> {
	
	public static void main(String[] args) {

	}
	
	/**
	 * 
	 * @param array1 �������
	 * @param array2 �������
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
