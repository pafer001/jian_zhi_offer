package jian_zhi_offer.test10;

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
