package week1.day2;

public class printOdd 
{
	public static void main(String[] args) 
	{
		System.out.println("The odd numbers from 1 to 10 are: ");
		for (int i = 0; i < 10; i++) 
		{
			if (i%2 != 0)
			{
				System.out.println(i);
			}			
		}
	}
}