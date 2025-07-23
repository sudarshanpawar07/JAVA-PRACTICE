import java.util.Scanner;
class SumOfDigits
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the number :");
		int num = sc.nextInt();
		int dup,sum = 0;
		
		dup = num;
		
		while(num != 0)
		{
			int digit = num % 10;
			
			sum += digit;
			
			num /= 10;	
		}

		System.out.print(" The sum of ditis of " + dup + " is " + sum);

	}
}