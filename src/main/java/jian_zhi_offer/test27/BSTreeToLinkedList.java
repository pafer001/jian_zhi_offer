package jian_zhi_offer.test27;

import java.util.ArrayList;
import java.util.List;

public class BSTreeToLinkedList {

	/*
	 * �Ѷ�Ԫ������ת��������˫������ ��Ŀ�� ����һ�ö�Ԫ�����������ö�Ԫ������ת����һ�������˫������
	 * Ҫ���ܴ����κ��µĽ�㣬ֻ����ָ���ָ�� 10 / \ 6 14 / \ / \ 4 8 12 16 ת����˫������
	 * 4=6=8=10=12=14=1
	 */
	public static void main(String[] args) {
		BSTreeToLinkedList bn = new BSTreeToLinkedList();
		int[] a = { 10, 6, 14, 4, 8, 12, 16 };// ��Щ�����ǰ�����������Ĳ�α������
		Node head = bn.creatTree(a);
		bn.toTwoWayLinkedList(head);
		bn.printTwoLinkedList(head);

	}

	/*
	 * ˼·��������������������ϴη��ʵĽڵ��Ϊprevious����ǰ���ʵĽڵ��Ϊcurrent��
	 * 
	 * ���ڱ��������е�ÿ����ǰ�ڵ㣬�øýڵ����ָ��ָ��previous(current->left = previous)����previous����ָ��
	 * 
	 * ָ��ǰ�ڵ�(previous->right = current)��Ȼ��previous����Ϊcurrent���������������ʱ������������Ҳ
	 * 
	 * ��ת��Ϊ˫�����ˡ�
	 * 
	 * ����˼·�ɲμ���http://hi.baidu.com/gropefor/blog/item/d2144f8ce0325105b31bba11.html
	 * 
	 * ���⣺���previousֻ����Ϊ���Ա���ܵõ���ȷ�Ľ������Ϊ�ֲ������Ļ����ҵò������⡣ �ҳ��Թ�����д��
	 * toTwoWayLinkedList(Node node,Node previous),��main�����������ʱ����
	 * toTwoWayLinkedList(head,null)���ò�����ȷ��
	 */
	private Node previous;

	public void toTwoWayLinkedList(Node node) {
		if (node != null) {
			toTwoWayLinkedList(node.getLeft());
			if (previous != null) {
				previous.setRight(node);
				node.setLeft(previous);
			}
			previous = node;
			toTwoWayLinkedList(node.getRight());
		}
	}

	public void printTwoLinkedList(Node node) {
		if (node != null) {
			// after converting to List,head=a[0]=10,but the head is not the
			// actually head of list.
			// the true head is 4.
			while (node.getLeft() != null) {
				node = node.getLeft();// find the true Head.
			}
			while (node != null) {
				System.out.print(node.getData() + " ");
				node = node.getRight();
			}
		}
	}

	public Node creatTree(int[] data) {
		List<Node> nodeList = new ArrayList<Node>();
		for (int each : data) {
			Node node = new Node(each);
			nodeList.add(node);
		}
		int lastRootIndex = data.length / 2 - 1;
		for (int i = lastRootIndex; i >= 0; i--) {
			int leftIndex = i * 2 + 1;
			Node root = nodeList.get(i);
			Node left = nodeList.get(leftIndex);
			root.setLeft(left);
			if (leftIndex + 1 < data.length) {
				Node right = nodeList.get(leftIndex + 1);
				root.setRight(right);
			}
		}
		Node head = nodeList.get(0);
		return head;

	}

}

class Node {
	private int data;
	private Node left;
	private Node right;

	public Node(int i) {
		data = i;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}
