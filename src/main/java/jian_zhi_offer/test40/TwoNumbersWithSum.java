package jian_zhi_offer.test40;

public class TwoNumbersWithSum {

	public static void getTwoNumbersWithSum(int array[], int k) {

		if (null == array || array.length == 1) {
			return;
		}

		int start = 0;
		int end = 1;

		int sum = array[start] + array[end];

		while (end < array.length && start < end) {
			if (sum > k) {
				sum -= array[start];
				start++;

			} else if (sum < k) {
				end++;
				if (end != array.length) {
					sum += array[end];
				}
			} else {
				printArray(array, start, end);
				end++;
				if (end != array.length) {
					sum += array[end];
				}
			}
		}

	}

	public static void printArray(int array[], int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int sum(int array[], int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		getTwoNumbersWithSum(array, 15);
	}
}
