package jian_zhi_offer.test21;

import java.util.Stack;

public class MinStack {
	
	private static Stack<Integer> valueStack =  new Stack<Integer>();
	private static Stack<Integer> minStack =  new Stack<Integer>();

	public static void main(String[] args) {
		int array[] = {2,5,2,7,1,3,1};
		
		for(int value : array) {
			push(value);
		}
		
		System.out.println("����");
		
	}
	
	public static void push(Integer value) {
		
		valueStack.push(value);
		if(minStack.empty()) {
			minStack.push(value);
		} else if(minStack.peek() >= value) {
			minStack.push(value);
		}
	}
	
	public static Integer pop() {
		Integer value = valueStack.pop();
		if(value == minStack.peek()) {
			minStack.pop();
		}
		
		return value;
	}
	
	public static Integer min() throws Exception {
		if(minStack != null) {
			return minStack.peek();
		}
		
		throw new Exception("ʧ��");
			
	}

}
