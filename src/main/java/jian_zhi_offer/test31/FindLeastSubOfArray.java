package jian_zhi_offer.test31;

/**
 * ��һ���������С������
 * @author puffer
 *
 */
public class FindLeastSubOfArray {
	
	public static void main(String args[]) {
		
		int array[] = {-2, 1,7,9, -3};
		
		System.out.println(findLeastSubOfArray(array));
	}

	public static int findLeastSubOfArray(int array[]) {
		int result = 0;
		int tempResult = result;

		for (int a : array) {
			if (result < 0) {
				result = 0;
			}
			result += a;
			if(result > tempResult) {
				tempResult = result;
			}
		}
		return result > tempResult ? result : tempResult;
	}

}
