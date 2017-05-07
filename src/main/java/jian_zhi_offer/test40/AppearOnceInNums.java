package jian_zhi_offer.test40;

/**
 * �����г���һ�ε�����
 * @author puffer
 *
 */
public class AppearOnceInNums {

	public static void main(String[] args) {

		int array[] = {1,2,3,1,2,4};
		getAppearOnceInNums(array);
	}

	public static void getAppearOnceInNums(int array[]) {
		int result = getXOXInNums(array);
		int index = getLast1InNum(result);
		int num1 = 0, num2 = 0;
		for(int a : array) {
			if(((a >> index) & 1) == 1) {
				num1 ^= a;
			} else {
				num2 ^= a;
			}
		}
		
		System.out.println(num1 + "  " + num2);

	}

	public static int getLast1InNum(int result) {
		int index = 0;

		while ((result & 1) == 0) {
			result = result >> 1;
			index++;
		}
		return index;
	}

	public static int getXOXInNums(int array[]) {
		int result = array[0];
		int index = 1;
		while (index < array.length) {
			result = result ^ array[index++];
		}
		return result;
	}

}
