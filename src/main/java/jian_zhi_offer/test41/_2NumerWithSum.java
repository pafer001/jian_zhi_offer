package jian_zhi_offer.test41;

/**
 * ��Ϊs��������
 * 
 * @author puffer
 *
 */
public class _2NumerWithSum {

	public static void main(String[] args) {
		
		int array[]= {1,3,4,5,6,7};
		find2NumberWithSum(array, 10);
	}
	
	public static void find2NumberWithSum(int array[], int k) {
		if(null == array) {
			return;
		}
		
		int head = 0;
		int end = array.length -1;
		
		while(head < end) {
			int sum = array[head] + array[end];
			if(k == sum ) {
				System.out.println(array[head] + " "+ array[end]);
				return;
			} else if(k > sum) {
				head++;
			} else {
				end--;
			}
			
		}
	}

}
