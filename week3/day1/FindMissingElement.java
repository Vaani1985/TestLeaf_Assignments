package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 3, 2, 8, 6, 7 };

		Arrays.sort(arr1);

		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j]);
		}
		System.out.println();
		for (int i = 0; i < arr1.length; i++) {
			if (i + 1 != arr1[i]) {
				System.out.println(i + 1);
				break;
			}
		}
	}
}