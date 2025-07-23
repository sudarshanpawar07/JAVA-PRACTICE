import java.util.Scanner;
class CountOfDigits
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the number :");
		int num = sc.nextInt();
		int dup,count= 0;
		
		dup = num;
		
		while(num != 0)
		{
			
			
			count++;
			
			num /= 10;	
		}

		System.out.print(" The count of ditis of " + dup + " is " + count);

	}
}