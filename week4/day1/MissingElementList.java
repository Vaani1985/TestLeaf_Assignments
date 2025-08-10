package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0; 	
		 int[] arr1 = {1, 2, 3, 4, 10, 6, 8};
		 List <Integer> list1 = new ArrayList <>();
		 
		 for (int i = 0; i < arr1.length; i++) {
				list1.add(arr1[i]);
		}	
		System.out.println("list 1: " +list1);
		Collections.sort(list1);
		System.out.println("after sort list 1 : " +list1);
		
		int sizeOfList1 = list1.size();
		System.out.println("the size of list1 : " +sizeOfList1);
		int range = list1.get(sizeOfList1-1);
		System.out.println("the range : " +range);
		
		for (int i = 0; i <= range; i++) {
			if (i == sizeOfList1-1) {
				break;
			}
			else if (list1.get(i) != list1.get(i+1)) {
				j = list1.get(i+1) - list1.get(i); 
				if (j > 1) {
					System.out.println("gappppp : " +(i+1));
				}
			}
		}	
	}
}