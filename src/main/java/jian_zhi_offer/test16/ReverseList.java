 package jian_zhi_offer.test16;

import jian_zhi_offer.bean.*;

public class ReverseList {

	public static void main(String[] args) {

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
		
		System.out.println("------------------------------------------------------");
		list.printNode();
		System.out.println("---------------------"
				+ "---------------------------------");
		reverseList(list);
		list.printNode();
		System.out.println("------------------------------------------------------");
	}
	
	public static void reverseList(LinkedList list) {
		
		Node head = list.getHead();
		Node pNode = head.getNext();
		Node lastNode = head;
		while(pNode != null) {
			Node<?> qNode = pNode.getNext();
			lastNode.setNext(qNode);
			
			pNode.setNext(head);
			
			head = pNode;
			pNode = qNode;
		}
		list.setHead(head);
	}

}
