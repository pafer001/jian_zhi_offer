package jian_zhi_offer.test05;

import java.util.LinkedList;
import java.util.Stack;

/**
 * 题目描述
 *
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 输入描述:
 *
 * 输入为链表的表头
 * 输出描述:
 *
 * 输出为需要打印的“新链表”的表头
 */
public class PrintListFromHead2End {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
//		printListFromHead2End(list);
        printListFromHead2End2(list);

    }

    public static void printListFromHead2End(LinkedList<Integer> list) {
        Stack<Integer> stack = new Stack<Integer>();

        for (Integer node : list) {
            stack.push(node);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }


    public static void printListFromHead2End2(LinkedList<Integer> list) {
        if (null == list && list.isEmpty()) {
            return;
        }

        int[] array = new int[list.size()];
        int lengthIndex = array.length - 1;
        for (int i = 0; i < list.size(); i++) {
            array[lengthIndex] = list.get(i);
            lengthIndex--;
        }

        for (int a : array ) {
            System.out.println(a);
        }
    }

}
