package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		int[] arr2 = {1, 2, 8, 4, 9, 7};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		List <Integer> list1 = new ArrayList <>(); 
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					list1.add(arr1[i]);
				}
			}	
		}	
		System.out.println("the list 1 : " +list1);
	}
}