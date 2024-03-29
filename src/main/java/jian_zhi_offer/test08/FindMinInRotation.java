package jian_zhi_offer.test08;

/**
 * 题目描述
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个非递减序列的一个旋转，输出旋转数组的最小元素。
 * 例如
 * 数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，
 * 该数组的最小值为1
 * @author puffer
 *
 */
public class FindMinInRotation {

	
	public static void main(String[] args) {
		
		int data[] = {3,4,5,6,7,1,2};
		try {
			findMinInRotation(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	/**
	 * 最大的数值后面是最小的
	 * @param array
	 */
	public static void findMinInRotation(int array[])   {

		if (array== null) {
			return;
		}

		int target = array[0];
		for (int tmp : array) {
			if (tmp < target) {
				System.out.println(tmp);
				break;
			}
		}

	}

}
