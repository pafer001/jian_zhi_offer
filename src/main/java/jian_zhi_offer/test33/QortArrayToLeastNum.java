package jian_zhi_offer.test33;

import java.util.Arrays;

public class QortArrayToLeastNum {

	public static void main(String[] args) {
		
		SubString s[] = new SubString[4];
		s[0] = new SubString("12");
		s[1] = new SubString("42");
		s[2] = new SubString("26");
		s[3] = new SubString("82");

		Arrays.sort(s);
		
		for(SubString t : s) {
			System.out.print(t.getS() + " ");
		}

	}

}
