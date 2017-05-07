package jian_zhi_offer.test17;

import java.util.ArrayList;
import java.util.List;

public class MergeList {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(5);
		list1.add(11);
		list1.add(14);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(7);
		list2.add(15);
		list2.add(51);
		list2.add(74);
		
		printList(mergeList(list1, list2));

	}
	
	public static void printList(List<Integer> list) {
		
		for(Integer node : list) {
			System.out.print(node + " ");
		}
		
	}
	public static List<Integer> mergeList(List<Integer> list1, List<Integer> list2) {
	
		List<Integer> list =  new ArrayList<Integer> ();
		int length1 = list1.size();
		int length2 = list2.size();
		int i = 0, j =0; 
		
		while(i<length1 && j < length2) {
			
			if(list1.get(i) > list2.get(j)) {
				list.add(list2.get(j++));
			} else {
				list.add(list1.get(i++));
			}
			
		}

		while(i<length1) {
			list.add(list1.get(i++));
		}
		
		while(j < length2) {
			list.add(list2.get(j++));
		}
		
		return list;
		
	}

}
