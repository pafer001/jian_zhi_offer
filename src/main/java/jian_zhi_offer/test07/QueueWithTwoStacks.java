package jian_zhi_offer.test07;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class QueueWithTwoStacks {
	
	/**
	 * 
	 * @param stack1 如队列时候写入stack1
	 *
	 * @param stack2 出队列时候，出栈底部的元素
	 *
	 */
	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	



	public static void main(String[] args) {

	}

	/**
	 * 入队列
	 * @param e
	 */
	public void inQueue(Integer e) {

		stack1.push(e);
	}

	/**
	 * 出队列
	 * @return
	 */
	public Integer outQueue() {

		if (stack1.isEmpty()) {
			return stack2.pop();
		} else {

			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}



	}

}
