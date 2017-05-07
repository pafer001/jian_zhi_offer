package jian_zhi_offer.test08;

/**
 * �ҳ���ת�����е���Сֵ������4,5,6,7,1,3
 * @author puffer
 *
 */
public class FindMinInRotation {

	
	public static void main(String[] args) {
		
		int data[] = {3,4,5,6,7,1,2};
		try {
			findMinInRotation(data, 0, 6);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void findMinInRotation(int data[], int start, int end) throws Exception {
		
		if(data == null || start < 0 || end < 0 || end < start) {
			throw new Exception("�쳣����");
		}
		
		int middle = (start + end) / 2;
		if(data[middle] < data[middle-1]) {
			if(data[middle] < data[middle+1]) {
				System.out.println(data[middle]);
			}
		} else {
			if(data[middle] < data[middle + 1])
				findMinInRotation(data, middle + 1, end);
			else 
				System.out.println(data[middle + 1]) ;
		}
	}
	
	public static int findMinPositionInRotation(int data[], int start, int end) throws Exception {
		
		if(data == null || start < 0 || end < 0 || end < start) {
			throw new Exception("�쳣����");
			
		}
		
		int middle = (start + end) / 2;
		if(data[middle] < data[middle-1]) {
			if(data[middle] < data[middle+1]) {
				return middle;
			} else {
				return -1;
			}
		} else {
			if(data[middle] < data[middle + 1])
				return findMinPositionInRotation(data, middle + 1, end);
			else 
				return middle + 1 ;
		}
	}

}
