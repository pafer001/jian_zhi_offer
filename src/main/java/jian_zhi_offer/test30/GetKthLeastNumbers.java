package jian_zhi_offer.test30;

/**
 * ��С��K����
 * @author puffer
 *
 */
public class GetKthLeastNumbers {
	
	public static void main(String args[]) {
		
		int[] numbers = {2,5,3,1};
		int[] result = getKthLeastNumbers(numbers, 3);
		printArray(result);
	}
	
	public static void printArray(int numbers[]) {
		for(int number : numbers) {
			System.out.println(number + " ");
		}
	}
	

	public static int[] getKthLeastNumbers(int numbers[], int k) {

		int result[] = new int[k];

		for (int i = 0; i < numbers.length; i++) {

			if(i == 0) {
				result[0] = numbers[0];
			} else 	if (i < k) {
				
				if(result[i-1] <= numbers[i]) {
					result[i] = numbers[i];
				} else {
					for(int j = i - 1 ; j >= 0 ; j --) {
						
						if(result[j] > numbers[i]) {
							result[j + 1] = result[j];
						} else {
							result[j + 1] = numbers[i];
							break;
						}
					}
				}

			} else {
				int j = k - 1;
				for( ; j >= 0 ; j--) {
					
					if(result[j] > numbers[i]) {
						if(j != k-1) {
							result[j + 1] = result[j];
						}
					} else {
						result[j-1] = numbers[i];
						break;
					}
				}
				if(j == -1) {
					result[j+1] = numbers[i];
				}
			}
		} 
		return result;
	}

}
