import java.util.Scanner;
class  PowerOfNumber
{
	public static void main(String [] args)
	{
		System.out.print(" enter  the number :");
		int num = new Scanner(System.in).nextInt();

		System.out.print(" exponent of number :");
		int exp = new Scanner(System.in).nextInt();
		power(num,exp);
	}
	
	public static void power(int num,int exp)
	{
		int power= 1;
		for(int i = 1; i<= exp ;i++)
		{	
			power *= num ;		
		}
			
		System.out.print(" power of " + num + "^" + exp + " is " + power);
	}
}