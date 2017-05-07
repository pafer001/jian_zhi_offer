package jian_zhi_offer.test51;

import java.util.TreeMap;

public class Duplicate {

	public static void main(String[] args) {

		int array[] = {1,2,1};
		duplicate(array);
		
	}
	
	public static void duplicate(int array[]) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		
		for(int a : array) {
			map.put(a, map.get(a) == null ? 1 :map.get(a) +1);
		}
		
		for(int a : array) {

			if(map.get(a) != 1) {
				map.put(a, 1);
				System.out.print(a + " ");

			}
		}
	}

//	public static void duplicate(int array[]) {
//
//		boolean loop = true;
//		
//		while(loop) {
//			for (int i = 0; i < array.length; i++) {
//				if (i != array[i]) {
//
//					if (array[array[i]] != array[i]) {
//						int temp = array[i];
//						array[i] = array[temp];
//						array[temp] = temp;
//						break;
//					} else if(){
//						System.out.println(i + " ");
//						continue;
//					}
//				} 
//				
//				if(i == array.length -1) {
//					loop = false;
//				}
//			
//			}
//		}
//	
//	}
//
//	public static boolean isChanged(int index_i, int index_j, int array[]) {
//
//		return array[index_i] != index_i && array[index_j] != index_j;
//	}

}
