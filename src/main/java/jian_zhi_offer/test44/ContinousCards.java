package jian_zhi_offer.test44;

import java.util.Arrays;


/**
 * �˿��Ƶ�˳��
 * @author puffer
 *
 */
public class ContinousCards {
	
	public static void main(String args[]) {
		
		int array[] = {1,2,3,4,5,0,0,9};
		System.out.println(isContinous(array));
	}
	
	public static boolean isContinous(int array[]) {
		
		Arrays.sort(array);
		int _o_count = 0;
		int diffence = 0;
		
		for(int i =0; i<array.length; i++) {
			if(array[i] == 0) {
				_o_count += 1;
			} else {
				if(i != array.length -1) {
					if(array[i+1] - array[i] != 1) {
						diffence += array[i+1] - array[i];
					}
				}
			}
		}
		
		if(0 != diffence && diffence > _o_count) {
			return false;
		}
		return true;
	}

}
