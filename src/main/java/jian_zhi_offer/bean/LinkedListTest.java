package jian_zhi_offer.bean;

public class LinkedListTest {

	public static void main(String[] args) {

		Node<String> node = new Node<String>();
		node.setE("1");
		node.setNext(null);	
		LinkedList<String> list = new LinkedList<String>(node);

//		list.printNode();

		Node<String> node1 = new Node<String>();
		node1.setE("2");
		list.addNode(node1);

		Node<String> node2 = new Node<String>();
		node2.setE("3");

		list.addNode(node2);
		list.printNode();
		
		
		
	}

}
