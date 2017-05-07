package jian_zhi_offer.test07;

import java.util.Stack;

public class QueueWithTwoStacks {
	
	/**
	 * 
	 * @param stack1
	 *            : ͷ
	 * @param stack2
	 *            �� β
	 */
	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	
	private int size;

	public QueueWithTwoStacks() {
		super();
		size = 0;
	}

	public static void main(String[] args) {

	}
	
	public void inQueue(Integer e) {
		stack2.add(e);
		setSize(getSize() + 1);
	}
	
	public Integer outQueue() {
		if(stack1.empty()) {
			while(!stack2.empty()) {
				stack1.push(stack2.pop());
			}
		}
		setSize(getSize() - 1);
		return stack1.pop();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
