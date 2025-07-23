import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		int dup = num;
		
		while(num != 0)
		{
			int digit  = num % 10;
						
			sum +=  digit * digit * digit;
		
			num /= 10;
			
			

		}
		if(dup == sum)
		{
			System.out.println(dup +" is armstrong number ");
		}
		else
		{
			System.out.println(dup +" is not armstrong number ");

		}
		
	}
}