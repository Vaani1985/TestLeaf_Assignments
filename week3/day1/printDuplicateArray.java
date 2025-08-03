package week3.day1;

import java.util.Arrays;

public class printDuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = { 2, 5, 7, 7, 5, 9, 2, 3 };
		Arrays.sort(scores);
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] == scores[i + 1]) {
				System.out.println(scores[i]);
			}
		}
	}
}