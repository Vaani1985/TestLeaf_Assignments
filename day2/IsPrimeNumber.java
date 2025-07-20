package week1.day2;
public class IsPrimeNumber 
{
	public void isPrime(int n)
	{
		for (int i = 2; i < n-1; i++) 
		{
			if (n%2 == 0)
			{
				System.out.println("not a prime");
			}
			else
			{
				System.out.println("prime");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		IsPrimeNumber obj1 = new IsPrimeNumber();
		obj1.isPrime(7);
		System.out.println("------------");
		obj1.isPrime(10);		
	}
}