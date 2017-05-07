package jian_zhi_offer.test15;


import jian_zhi_offer.bean.LinkedList;
import jian_zhi_offer.bean.Node;

public class KthNodeFromEnd {

	public static void main(String[] args) throws Exception {

		Node<String> node = new Node<String>();
		node.setE("1");
		node.setNext(null);	
		LinkedList<String> list = new LinkedList<String>(node);

		Node<String> node1 = new Node<String>();
		node1.setE("2");
		list.addNode(node1);

		Node<String> node2 = new Node<String>();
		node2.setE("3");

		list.addNode(node2);
		
		list.printNode();
		
		System.out.println("------------------------------------------");
		
		Node resultNode = getKthNodeFromEnd(list, 2);
		System.out.println(resultNode);
		
	}

	public static Node<?> getKthNodeFromEnd(LinkedList<?> list, int k) throws Exception {
		
		if(null == list || list.getCount() < k) {
			throw new Exception("�������������Ҫ��");
		}
		Node<?> qNode = list.getHead();
		Node<?> pNode = list.getHead();
		int i = 1;
		for(; i < k; i++) {
			pNode = pNode.getNext();
		}
		
		while(i < list.getCount()) {
			qNode = qNode.getNext();
			i++;
		}
		
		
		return qNode;
		
	}
}
