import java.util.Scanner;
class StaticBlock
{
	static Scanner sc = new Scanner(System.in);
	static int  fact = factorial(sc.nextInt()); // 4
	public static void main(String [] args)
	{	
		System.out.println(" main() ");
		System.out.println(" factorial  : " + fact);	
	}
	
	public static int factorial(int num)
	{	
		System.out.println(" Factorial method  : " );
		int fact = 1;
		for(int i = 1; i <= num; i++)
		{
			fact *= i;
	
		}
		return fact;
	}

}