package jian_zhi_offer.test05;

import java.util.LinkedList;
import java.util.Stack;

public class PrintListFromHead2End {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		printListFromHead2End(list);

	}
	
	public static void printListFromHead2End(LinkedList<Integer> list) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(Integer node : list) {
			stack.push(node);
		}
		
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
	}

}
