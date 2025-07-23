import java.util.Scanner;
class SumOfDigits
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter The Number : ");
		int num = sc.nextInt();
			
		int dup = num,sum = 0;
		
		for(;num != 0 ;num/=10)
		{
			int digit = num % 10;
			sum += digit;
		}
		
		System.out.println(" The sum of digits " + dup + " is : " + sum); 
		
	}
}