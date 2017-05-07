package jian_zhi_offer.test35;

import java.util.HashMap;
import java.util.Map;

/**
 * ��һ������һ�ε��ַ���
 * @author puffer
 *
 */
public class FirstNotReatingChar {

	public static void main(String[] args) throws Exception {

		String str = "adasjhksjk";
		System.out.println(getFirstNotReatingChar(str.toCharArray()));
	}
	
	public static char getFirstNotReatingChar(char[] str) throws Exception {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(char s : str) {
			String key = new String(new char[]{s}) ;
			map.put(key, map.get(key) == null ? 1 : map.get(key) + 1);
		}
		
		for(char s : str) {
			String key = new String(new char[]{s});
			 if(map.get(key) == 1)
				 return s;
		}
		
		throw new Exception("û��");
	}

}
