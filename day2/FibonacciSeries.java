package week1.day2;
public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		int n1=0, n2=1, n3=01, range=8;
		System.out.print(n1+ " " +n2+ " ");
		for (int i = 2; i < range; i++) 
		{
			n3=n1+n2;
			System.out.print(" " +n3+ " ");
			//swap
			n1=n2;
			n2=n3;
		}
	}
}