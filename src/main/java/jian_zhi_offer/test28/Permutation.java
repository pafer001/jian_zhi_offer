package jian_zhi_offer.test28;
                                                                                                                   
public class Permutation {
	
	public static void main(String args[]) {
		char ch[] = {'a', 'b', 'c'};
		permutation(ch, 0);
	}

	public static void permutation(char ch[], int index) {
		if(index == ch.length) {
			System.out.println(ch);
		} else  {
			for(int i = index; i < ch.length; i++) {
				char temp = ch[i];
				ch[i] = ch[index];
				ch[index] = temp;
				
				permutation(ch, index + 1);
				
				temp = ch[i];
				ch[i] = ch[index];
				ch[index] = temp;
			}
		}
	}
}
