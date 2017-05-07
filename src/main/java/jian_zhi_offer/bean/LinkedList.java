package jian_zhi_offer.bean;

/**
 * 
 * @author puffer
 *
 * @param <E>
 */
public class LinkedList<E> {

	private Node<E> head;
	private int count;

	public LinkedList(Node<E> head) {
		super();
		this.head = head;
		this.count = 1;
	}
	
	public LinkedList() {
		super();
		this.head = null;
		this.count = 0;
	}
	
	public void addNode(Node<E> node) {
		
		node.setNext(null);
		
		Node<E> curNode = this.getNode(count-1);
		
		curNode.setNext(node);
		
		count ++;
	}
	
	
	public void deleNode(int index) {
		if(index < 0 && index >= count) {
			throw  new IndexOutOfBoundsException("index is out of bound of array!");
		}
		
		if(0 == index) {
			Node<E> node = getNode(index).getNext();
			if(null != node) {
				head.setNext(node.getNext());
			} else {
				head.setNext(null);
			}
			count--;
		} else if(index == count - 1) {
			Node<E> node = getNode(index-1);
			node.setNext(null);
			count--;
		} else {
			Node<E> node = getNode(index);
			Node<E> preNode = getNode(index-1);
			preNode.setNext(node.getNext());
			count--;
		}

	}
	
	/**
	 * 
	 * @param index :��0��count-1
	 * @return
	 */
	public Node<E> getNode(int index) {
		
		Node<E> e = head;
		if(index < 0 && index >= count) {
			throw  new IndexOutOfBoundsException("index is out of bound of array!");
		}

		for(int i =1 ; i<= index; i++) {
			e = e.getNext();
		}
		
		return e;
	}
	
	public void printNode() {
		if(0 != count) {
			for(int i=0; i<count; i++) {
				System.out.println(getNode(i));
			}
		}
	}
	
	public Node<E> getLastNode() {
		
		Node<E> e = head;
		if(count < 0) {
			throw  new IndexOutOfBoundsException("index is out of bound of array!");
		}

		for(int i =1 ; i <= count -1; i++) {
			e = e.getNext();
		}

		return e;
	}

	public Node<E> getHead() {
		return head;
	}

	public void setHead(Node<E> head) {
		this.head = head;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
