package jian_zhi_offer.test42;

public class ReverseSentence {

	public static void reserse(char ch[], int start, int end) {

		while (start < end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start ++;
			end --;
		}
	}

	public static void reverseWorld(char ch[]) {

		int start = 0;
		int end = 0;

		while (end < ch.length) {

			while (end < ch.length - 1 && ch[end] != ' ') {
				end++;
			}
			reserse(ch, start, end - 1);
			end ++;
			start = end;
		}
	}
	
	public static void printSentence(char ch[]) {
		System.out.print(new String(ch));

	}

	public static void main(String[] args) {
		
		String str = "I am student.";
		char ch [] = str.toCharArray();
		reserse(ch, 0, str.length()-1);
		reverseWorld(ch);
		
		printSentence(ch);
		
	}
}
