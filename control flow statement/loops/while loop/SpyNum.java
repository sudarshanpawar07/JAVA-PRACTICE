import java.util.Scanner;
class SpyNum
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		int dup = num,sum = 0,product = 1;
		
		for(;num != 0 ;num/=10)
		{
			int digit = num % 10;
			sum += digit;
			product *= digit;
		}
		
		
		if(product == sum)
		{
			System.out.println(du + " Spy Number");
		}
		else
		{
			System.out.println( dup + "  not Spy Number");
		

		}
	}
}