package week3.day1;

public class oddIndexUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="changeme";
		char[] charArray = str1.toCharArray();
		for (int i = 0; i < str1.length(); i++)
		{
			if (i%2 != 0)
			{
				System.out.println(charArray[i]);
			}		
			
			//break;
		}
		String upperCase = str1.toUpperCase();
		System.out.println(upperCase);
	}
}