package week2.day1;

public class Palindrome {

	public static void main(String[] args) {
		int input=12345, output=0,rem=0;
		int temp=input;
		for (;input!=0;input/=10) 
		{
			rem=input%10;
			output=output*10+rem;
			System.out.println("rem: " + rem + " ");
			System.out.println("input: " + input + " ");
			System.out.println("output: " + output + " ");
		}	
		if (temp == output) {
			System.out.println("Palindrome");
		}
		else if (temp != output)
		{
			System.out.println("not a a Palindrome");
		}
	}
}