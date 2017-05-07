package jian_zhi_offer.test34;

/**
 * ����
 * @author puffer
 *
 */
public class UglyNumber {

	public static void main(String[] args) {

		System.out.println(getUglyNumber(5));
	}

	public static int getUglyNumber(int count) {

		int array[] = new int[count + 1];
		array[0] = 1;

		int _2_index = 0;
		int _3_index = 0;
		int _5_index = 0;
		
		int index = 1;
		while(index <= count) {
			int min = getMin(array[_2_index] * 2, array[_3_index] * 3,
					array[_5_index] * 5);
			array[index ++ ] = min;
			if(min == array[_2_index] * 2) {
				_2_index ++;
			} else if(min == array[_3_index] * 3) {
				_3_index ++;
			} else {
				_5_index ++;
			}
		}

		return array[count];

	}

	public static int getMin(int num1, int num2, int num3) {
		int min = num1 < num2 ? num1 : num2;
		min = min < num3 ? min : num3;
		return min;
	}

}
