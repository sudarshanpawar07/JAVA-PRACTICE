import java.util.Scanner;
class ProductNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the Number " );
		int num = sc.nextInt();
		int dup = num;
		int product = 1;
		
		while(num != 0)
		{
			int digit = num % 10;
			product *= digit;
			num/= 10;
		}	
			
		System.out.println(" Number is : " + dup);
		System.out.println(" Product of Digits is : " + product);
	}
}