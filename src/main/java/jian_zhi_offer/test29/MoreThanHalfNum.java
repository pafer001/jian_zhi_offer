package jian_zhi_offer.test29;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MoreThanHalfNum {
	
	
	public static void main(String args[]) throws Exception {
		int numbers[] ={1,2,1};
		System.out.println(findMoreThanHalfNum(numbers));
	}
	
	public static int findMoreThanHalfNum(int number[]) throws Exception {
   
		if(null == number || number.length == 0) {
			throw new Exception("���������⣡");
		}
		int length = number.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i< length; i++) {
			Integer key = number[i];
			if(map.get(key) == null) {
				map.put(key, 1);
			} else  {
				int value = map.get(key);
				map.put(key,  1+ value);
			}
		}
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			Integer value = map.get(key);
			if(value > length >> 1) {
				return key;
			}
		}
		return 0;
	}

}
