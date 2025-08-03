package week3.day1;

import java.util.Arrays;

public class anagramString {

	public static void main(String[] args) {
		String text1 = "silent";
		String text2 = "listen";
		
		if(text1.length() == text2.length())
		{
			char[] strArray1 = text1.toCharArray();
			char[] strArray2 = text2.toCharArray();
			
			Arrays.sort(strArray1);
			Arrays.sort(strArray2);
			for(int i=0; i < strArray1.length; i++)
			{
				System.out.print(strArray1[i]);
			}
			System.out.println();
			for(int j=0; j < strArray2.length;j++)
			{
				System.out.print(strArray2[j]);
			}
			System.out.println();
			if (Arrays.equals(strArray1,strArray2))
			{
				System.out.println("Anagram Strings");
			}
			else
			{
				System.out.println("not Anagram Strings");
			}
		}
		else
		{
			System.out.println("Length mismatch, not a Anagram");
		}
	}
}