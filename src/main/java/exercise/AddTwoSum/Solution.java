package exercise.AddTwoSum;

/**
 * Created by pafer on 17-5-6.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 =l1;
        ListNode p2 =l2;

        int lastValue = 0;
        while (p1 != null && p2 != null) {

            int value = p1.val + p2.val + lastValue;
            if (value >= 10) {
                value -= 10;
                lastValue = 1;
            } else {
                lastValue = 0;
            }
            p1.val = value;

            p1 = p1.next;
            p2 = p2.next;
        }

        while (p1 != null) {
            int value = p1.val +  lastValue;
            if (value >= 10) {
                value -= 10;
                lastValue = 1;
            } else {
                lastValue = 0;
            }
            p1.val = value;
            p1 = p1.next;
        }

        while (p2 != null) {
            int value = p2.val +  lastValue;
            if (value >= 10) {
                value -= 10;
                lastValue = 1;
            } else {
                lastValue = 0;
            }
            p1 = new ListNode(value);
            p1 = p1.next;
            p2 = p2.next;
        }

        if (lastValue != 0) {
            p1 = new ListNode(lastValue);
        }

        return l1;
    }

    public static void main(String[] args) {


        ListNode listNode1 = new ListNode(1);
        listNode1.next=new ListNode(3);
        listNode1.next.next=new ListNode(7);
        ListNode listNode2 = new ListNode(4);
        listNode2.next=new ListNode(7);
        listNode2.next.next=new ListNode(9);

        ListNode listNode = addTwoNumbers(listNode1, listNode2);
        System.out.println(listNode);

    }
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


