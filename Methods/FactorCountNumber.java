import java.util.Scanner;
class FactorCountNumber
{
	public static void main(String [] args)
	{
		System.out.print(" Enter the number : ");
		int num = new Scanner(System.in).nextInt();
		
		findFactorCount(num);
		
	}
	
		
	public static void findFactorCount(int num)
	{
		int count = 0;
		
		for(int i = 1; i<= num;i++)
		{	
			
			if(num % i == 0) count++;
				
			
		}
		System.out.println(" factors count  of " + num + " is " + count );
		
		
	}
}