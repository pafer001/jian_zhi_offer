package jian_zhi_offer.test37;

import java.util.List;
import java.util.Stack;

public class FirstCommonNode {

	public static void main(String[] args) {

	}

	public static Integer getFirstCommonNode(List<Integer> list1, List<Integer> list2) {
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		
		for(Integer value :list1) {
			stack1.push(value);
		}
		
		for(Integer value :list2) {
			stack2.push(value);
		}
		
		int commonValue = 0;
		while(stack1.peek() == stack2.peek()) {
			commonValue = stack1.peek();
			stack1.pop();
			stack2.pop();
		}
		
		return commonValue;

	}
}
