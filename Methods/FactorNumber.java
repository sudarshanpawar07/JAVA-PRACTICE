import java.util.Scanner;
class FactorNumber
{
	public static void main(String [] args)
	{
		System.out.print(" Enter the number : ");
		int num = new Scanner(System.in).nextInt();
		
		findFactor(num);
		
	}
	
		
	public static void findFactor(int num)
	{
		
		System.out.println(" factors of " + num + " is ");
		for(int i = 1; i<= num;i++)
		{	
			
			if(num % i == 0)
			{
				
				System.out.println(i);
				
			}
		}
		
		
	}
}