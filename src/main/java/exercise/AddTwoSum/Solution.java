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

        ListNode p1 =  l1;
        ListNode p2 = l2;
        ListNode p = null;
        ListNode lastPoint = null;
        int lastValue = 0;

        while (p1 != null && p2 != null) {
            int value = p1.val + p2.val + lastValue;

            lastValue = value / 10;
            ListNode listNode = new ListNode(value % 10);

            if (p == null) {
                p = listNode;
                lastPoint = listNode;
            } else  {
                lastPoint.next = listNode;
                lastPoint = listNode;
            }

            p1 =  p1.next;
            p2 = p2.next;
        }

        while (p1 != null) {
            int value = p1.val + lastValue;

            lastValue = value / 10;
            ListNode listNode = new ListNode(value % 10);

            if (p == null) {
                p = listNode;
                lastPoint = listNode;
            } else  {
                lastPoint.next = listNode;
                lastPoint = listNode;
            }

            p1 =  p1.next;
        }

        while (p2 != null) {
            int value = p2.val + lastValue;

            lastValue = value / 10;
            ListNode listNode = new ListNode(value % 10);

            if (p == null) {
                p = listNode;
                lastPoint = listNode;
            } else  {
                lastPoint.next = listNode;
                lastPoint = listNode;
            }

            p2 = p2.next;
        }

        if (lastValue != 0) {
            ListNode listNode = new ListNode(lastValue );
            lastPoint.next = listNode;

        }
        return p;
    }

    public static void main(String[] args) {


        ListNode listNode1 = new ListNode(5);
        listNode1.next=new ListNode(3);
//        listNode1.next.next=new ListNode(7);
        ListNode listNode2 = new ListNode(5);
        listNode2.next=new ListNode(7);
        listNode2.next.next=new ListNode(9);

        ListNode listNode = addTwoNumbers(listNode1, listNode2);
        print(listNode);

    }

    static void print(ListNode listNode) {

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


