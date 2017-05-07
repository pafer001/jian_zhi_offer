package jian_zhi_offer.test04;

public class MergeArray {

	public static void main(String[] args) {
		int a[] = new int[10];
		a[0] = 1;
		a[1] = 3;
		a[2] =5;
		int b[] = {2,4,6,8,10};
		mergeArray(a, b, 3);
		printArray(a);
	}
	
	public static void printArray(int array[]) {
		for(int a : array) {
			System.out.println(a);
		}
		System.out.println();
	}
	
	public static void mergeArray(int a[], int b[], int aSize) {
		int i = aSize -1;
		int j = b.length -1;
		int k = aSize + b.length -1;
		
		while(i >= 0 && j >= 0) {
			if(a[i] > b[j]) {
				a[k--] = a[i--];
			} else {
				a[k--] = b[j--];
			}
		}
		
		while(j >= 0) {
			a[k--] = b[j--];

		}
		
	}

}
