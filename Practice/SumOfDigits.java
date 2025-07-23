import java.util.Scanner;
class SumOfDigits
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter the number (length 1-4): " );
		
		int num = sc.nextInt();
		int dup = num;
		
		int sum = 0;
		
		int rem = num % 10;
		sum = sum + rem;
		num = num / 10;
		
		rem = num % 10;
		sum = sum + rem;
		num = num / 10;
		
		rem = num % 10;
		sum = sum + rem;
		num = num / 10;

		rem = num % 10;
		sum = sum + rem;
		num = num / 10;
	
		System.out.println(" num : " + dup);
		System.out.println(" sum : " + sum);



	}
}