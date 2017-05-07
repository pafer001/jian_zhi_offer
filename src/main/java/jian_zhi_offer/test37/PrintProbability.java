package jian_zhi_offer.test37;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintProbability {

	public static void main(String[] args) {

		System.out.println(getProbability(3, 3));
	}
	
	/**
	 * 
	 * @param n
	 *            : ���ӵĸ���
	 * @param num
	 *            �� ��Ҫ��ѯ����
	 * @return
	 */
	public static int getPrintProbability(int n, int num) {

		if (num <= 0 || num <= 0)
			return 0;

		if (n == 1 && num >= 1 && num <= 6) {
			return 1;
		}
		return getPrintProbability(n - 1, num - 1)
				+ getPrintProbability(n - 2, num - 2)
				+ getPrintProbability(n - 3, num - 3)
				+ getPrintProbability(n - 4, num - 4)
				+ getPrintProbability(n - 5, num - 5)
				+ getPrintProbability(n - 6, num - 6);

	}
	
	public static int getProbability(int n, int num) {

		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		
		map1.put(1, 1);
		map1.put(2, 1);
		map1.put(3, 1);
		map1.put(4, 1);
		map1.put(5, 1);
		map1.put(6, 1);
		
		for(int i = 2; i<= n; i++) {
			
			Set<Integer> keys = map1.keySet();
			
			for(Integer key : keys) {
				for(int j =1; j<=6; j++) {
					map2.put(key + j, map1.get(key) + (map1.get(key + j)== null ? 0: map1.get(key + j)));
				}
			}
			
			map1 = new HashMap<Integer, Integer>();
			map1.putAll(map2);
			map2 = new HashMap<Integer, Integer>();
		}
		
		return map1.get(num);
	}

}
