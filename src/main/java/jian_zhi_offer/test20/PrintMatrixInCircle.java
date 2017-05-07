package jian_zhi_offer.test20;

public class PrintMatrixInCircle {
	
	
	public static void main(String args[]) {
		int numbers[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		printMatrixClockwisely(numbers, 3, 3);
	}

	public static void printMatrixClockwisely(int numbers[][], int columns, int rows) {
		
		if(null == numbers || columns <= 0 || rows <=0 ) {
			return ;
		}
		
		int start = 0;
		while(columns > start *2 && rows > start * 2) {
			printMatrixInCircle(numbers, columns, rows,  start);
			++start;
		}
	}
	
	public static void printMatrixInCircle(int numbers[][], int columns,
			int rows, int start) {

		int endX = columns - 1 - start;
		int endY = rows - 1 - start;

		// �����Ҵ�ӡһ��
		for (int i = start; i <= endX; ++i) {

			int number = numbers[start][i];
			System.out.print(number + " ");
		}

		// ���ϵ��´�ӡһ��
		if (start < endY) {

			for (int i = start + 1; i <= endY; i++) {
				int number = numbers[i][endX];
				System.out.print(number + " ");
			}
		}

		// �����Ҵ�ӡһ��
		if (start < endX && start < endY) {

			for (int i = endX - 1; i >= start; i--) {
				int number = numbers[endY][i];
				System.out.print(number + " ");
			}
		}

		// ���µ��ϴ�ӡһ��
		if (start < endX && start < endY - 1) {

			for (int i = endY - 1; i >= start + 1; i--) {
				int number = numbers[i][start];
				System.out.print(number + " ");
			}
		}

	}
}
