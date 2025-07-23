import java.util.Scanner;
class ProductOfNumber
{
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		int dup = num,product = 1;
		
		for(;num != 0;num /= 10)
		{
			int digit = num % 10;
			product *= digit;
		}

		System.out.println(" Number is : " + dup);
		System.out.println(" Product of Digits is : " + product);
	}
}