import java.util.Scanner;
class BestPrime
{
	public static void main(String [] args)
	{
		Scanner  sc = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int num = sc.nextInt();
		
		if(isPrime(num,2))
		{
			System.out.println(" is Prime ");
		}
		else
		{
			System.out.println(" is not prime ");

		}
	}
	

	public static boolean isPrime(int num,int start)
	{
		if(num < 2) return false;
		if(start >= (num/2) + 1) return true;
		if(num % start == 0) return false;
		
		return isPrime(num, ++start);
	}
}