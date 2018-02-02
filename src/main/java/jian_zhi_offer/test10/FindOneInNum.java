package jian_zhi_offer.test10;

/**
 * 题目描述
 *
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * 样例输入
 *
 * 3 4 5 -1
 * 样例输出
 *
 * 1 2 32
 */
public class FindOneInNum {

	public static void main(String[] args) {

		System.out.println(findOneInNum(3));

	}

	public static int findOneInNum(int num) {
		int count = 0;
		while (num != 0) {
			num = num & (num - 1);
			count++;
		}
		return count;
	}

}
