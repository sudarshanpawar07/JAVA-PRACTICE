import java.util.Scanner;
class  PrimeNumber
{
	public static void main(String [] args)
	{
		System.out.print(" enter  the number :");
		int num = new Scanner(System.in).nextInt();
		isPrime(num);
	}
	
	public static void isPrime(int num)
	{
		int count = 0;
		for(int i = 1; i<= num ;i++)
		{	
			if(num % i == 0)
			{
				count ++;
			}
		}
		if(count == 2)
		{
			System.out.println(num + " is Prime ");
		}
		else
		{
			System.out.println(num + " is not prime ");
		}
	}
}