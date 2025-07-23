import java.util.Scanner;
class ReverseNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number : " );

		int num = sc.nextInt();
		int dup = num;
			
		int rev = 0;
		
		 int rem = num % 10;
		 rev = rev * 10 + rem;
		 num /= 10;
		 

		rem = num % 10;
		 rev = rev * 10 + rem;
		 num /= 10;
		
		rem = num % 10;
		 rev = rev * 10 + rem;
		 num /= 10;
		
		rem = num % 10;
		 rev = rev * 10 + rem;
		 num /= 10;
	
		System.out.println(" Number : " + dup);
		System.out.println(" Reverse Number : " + rev);

	}
}