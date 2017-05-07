package jian_zhi_offer.test38;

/**
 * ���������������г��ֵĴ���
 * @author puffer
 *
 */
public class GetNumberOfK {

	public static void main(String[] args) {

		int array[] = { 1, 2, 2, 2, 4, 6 };
		System.out.println(getNumberOfK(array, 2));
	}

	public static int getNumberOfK(int array[], int k) {
		int index = getFristK(array, k, 0, array.length - 1);
		int count = 0;
		while (index < array.length && array[index] == k) {
			count++;
			index++;
		}
		return count;
	}

	public static int getFristK(int array[], int k, int start, int end) {

		if (start > end) {
			return -1;
		}

		int middle = (start + end) / 2;
		if (array[middle] > k) {
			end = middle - 1;
			// getFristK(array, k, start, middle - 1);
		} else if (array[middle] < k) {
			start = middle + 1;
			// getFristK(array, k, middle + 1, end);
		} else {
			if (k > 0 && array[middle - 1] == k) {
				end = middle - 1;
				// getFristK(array, k, start, middle - 1);
			} else {
				return middle;
			}
		}
		return getFristK(array, k, start, end);
	}

}
