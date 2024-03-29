package jian_zhi_offer.test12;

/**
 * 题目描述
 *
 * 给定一个数字N，打印从1到最大的N位数。
 *
 * 输入
 *
 * 每个输入文件仅包含一组测试样例。
 *
 * 对于每个测试案例，输入一个数字N(1<=N<=5)。 输出 对应每个测试案例，依次打印从1到最大的N位数。
 *
 * 样例输入
 *
 * 1
 *
 * 样例输出
 *
 * 1 2 3 4 5 6 7 8 9
 */
public class Print1ToMaxOfNDigits {

	public static void main(String[] args) throws Exception {
		print1ToMaxOfNDigits(2);
	}

	public static void print1ToMaxOfNDigits(int n) throws Exception {
		if (n <= 0) {
			throw new Exception("����������Ҫ��");
		}
		char num[] = new char[n];
		for (int i = 0; i < 10; i++) {
			num[0] = (char) (i + '0');
			print1ToMaxOfNDigits(num, 0);
		}
	}

	public static void print1ToMaxOfNDigits(char num[], int index) {
		if (index == num.length - 1) {
			printNum(num);
			return;
		}

		for (int i = 0; i < 10; i++) {
			num[index + 1] = (char) (i + '0');
			print1ToMaxOfNDigits(num, index + 1);
		}

	}

	public static void printNum(char num[]) {
		
		boolean beiginDigitWith0 = true;
		for (int i = 0; i < num.length; i++) {
			if(beiginDigitWith0 && num[i] != '0') {
				beiginDigitWith0 = false;
			}

			if(!beiginDigitWith0) {
				System.out.print(num[i]);
			}
		}
		System.out.println();
	}

}
