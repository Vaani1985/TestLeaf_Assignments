package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargeList {

	public static void main(String[] args) {
		
			int[] arr1 = {3, 2, 11, 4, 6, 7};
			List <Integer> list1 = new ArrayList <>(); 
			
			for (int i = 0; i < arr1.length; i++) {
				list1.add(arr1[i]);
			}	
			System.out.println("the list 1 : " +list1);
			Collections.sort(list1);
			System.out.println("the list 1 after sort 	: " +list1);
			
			int sizeOfList = list1.size();
			System.out.println("the size of list 1 : " +sizeOfList);
			
			int secondLargest = list1.get(sizeOfList - 2);
			System.out.println("the second largest element in list 1 : " +secondLargest);
	}
}