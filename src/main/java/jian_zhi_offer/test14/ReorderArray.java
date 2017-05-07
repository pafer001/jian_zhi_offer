package jian_zhi_offer.test14;

/**
 * ������ż����ǰ��
 * @author puffer
 *
 */
public class ReorderArray {

	public static void main(String[] args) throws Exception {

		int array[] = {};
		reorderArray(array);
		printArray(array);
	}
	
	public static void reorderArray(int array[]) throws Exception {
		if(null == array || array.length < 0) {
			throw new Exception("���ݲ������Ϸ�");
		} else if(array.length == 1) {
			return ;
		}
		
	
		
		int i =0, j = array.length - 1;
		while(i < j) {
			if(isOdd(array[i])) {
				i++;
			} else if(!isOdd(array[j])) {
				j++;
			} else {
				 int temp = array[i];
				 array[i] = array[j];
				 array[j] = temp;
				 i++;
				 j--;
			}
		}
		
	}

	public static boolean isOdd(int num) {
		return (num & 0x1) == 1;
	}
	
	public static void printArray(int num[]) {
		for(int a : num) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
