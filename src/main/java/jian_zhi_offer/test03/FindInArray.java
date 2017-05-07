package jian_zhi_offer.test03;

/**
 * ��ά����Ĳ���
 * @author puffer
 *
 */
public class FindInArray {

	public static void main(String[] args) {
		
		int array[][] = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
		
		System.out.println(new FindInArray().find(array, 4, 4, 11));
		

	}
	
	public boolean find(int array[][], int row, int column, int number) {
		
		for(int i= column-1; i>=0;) {
			for(int j=0; j<row;) {
				if(array[j][i] == number) {
					return true;
				} else if(number > array[j][i]) {
					j = j + 1;
				} else {
					i = i -1;
				}
			}
		}
		
		return false;
	}

}
