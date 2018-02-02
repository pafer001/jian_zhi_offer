package jian_zhi_offer.test04;

/**
 * @author wangzhenya
 * 题目描述
 *请实现一个函数，将一个字符串中的空格替换成“%20”。 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *We Are Happy
 *We%20Are%20Happy
 */
public class ReplaceSpaces {

	public static void main(String[] args) {

		char ch[] = "h wiq iw iw whw ij d sk".toCharArray();

		System.out.println(countSpaces(ch));
		System.out.println(replaceSpaces(ch, countSpaces(ch)));
	}

	/**
	 * 
	 * @param ch
	 * @return 计算空格的数量
	 */
	private static int countSpaces(char ch[]) {

		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				count++;
			}
		}
		return count;
	}

	/**
	 * 
	 * @param ch
	 * @param count
	 * 替换空格数量
	 */
	private static char[]  replaceSpaces(char ch[], int count) {

		char[] result = new char[ch.length + 2 * count];
		int j = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ') {
				result[j] = ch[i];
				j++;
			} else {
				result[j++] = '2';
				result[j++] = '0';
				result[j++] = '%';
			}
		}
		return result;
	}

}
