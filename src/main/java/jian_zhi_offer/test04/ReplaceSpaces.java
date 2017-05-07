package jian_zhi_offer.test04;

public class ReplaceSpaces {

	public static void main(String[] args) {

		char ch[] = "h wiq iw iw whw ij d sk".toCharArray();

		System.out.println(countSpaces(ch));
		System.out.println(replaceSpaces(ch, countSpaces(ch)));
	}

	/**
	 * 
	 * @param ch
	 * @return �ַ������пո������
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
	 *            :�ո������
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
