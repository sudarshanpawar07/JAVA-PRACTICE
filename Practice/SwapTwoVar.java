import java.util.Scanner;
class SwapTwoVar
{
	public static void main(String [] args)
	{
		Scanner sc  = new Scanner(System.in);

		
		System.out.print(" Enter the first number : " );
		int a = sc.nextInt();
		System.out.print(" Enter the second number : ");
		int b = sc.nextInt();
	
		System.out.println(" BEFORE SWAPPING : ");
		System.out.println(" a : " + a);
		System.out.println(" b : " + b);    

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println();
		System.out.println(" AFTER SWAPPING : ");
		System.out.println(" a : " + a);
		System.out.println(" b : " + b); 
	}
}