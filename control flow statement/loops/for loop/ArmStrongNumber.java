import java.util.Scanner;
class ArmStrongNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		int dup = num,sum = 0;
		
		for(;num != 0;num/= 10)
		{
			int digit = num % 10;
			
			sum += digit * digit * digit;
			
		}
		
		if(dup == sum)
		{
			System.out.println(dup + " is ArmStrongNumber ");
		}
		else
		{
			System.out.println(dup + " is not armstrongNumber ");
		}
	}
}