package jian_zhi_offer.suanfa;

public class QuickSort {


	public int partition(int data[], int low, int high) {
		  int tmp = data[low];    //����ĵ�һ����Ϊ����  
	        while (low < high) {  
	            while (low < high && data[high] > tmp) {  
	                high--;  
	            }  
	            data[low] = data[high];   //������С�ļ�¼�Ƶ��Ͷ�  
	            while (low < high && data[low] < tmp) {  
	                low++;  
	            }  
			data[high] = data[low];   //�������ļ�¼�Ƶ��߶�  
	        }  
	        data[low] = tmp;              //�����¼��β  
	        return low;                   //���������λ��  
	}

	public void _quickSort(int[] list, int low, int high) {
		if (low < high) {
			int middle = partition(list, low, high); // ��list�������һ��Ϊ��
			_quickSort(list, low, middle - 1); // �Ե��ֱ���еݹ�����
			_quickSort(list, middle + 1, high); // �Ը��ֱ���еݹ�����
		}
	}

	public void quick(int[] str) {
		if (str.length > 0) { // �鿴�����Ƿ�Ϊ��
			_quickSort(str, 0, str.length - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 34, 3, 53, 23, 7, 14, 10 };
		QuickSort qs = new QuickSort();
		qs.quick(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}

}
