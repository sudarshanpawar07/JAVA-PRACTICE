import java.util.Scanner;
class IfStatement
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the number : " );
		int num = sc.nextInt();
			
		
		if( num % 2 == 0 && num % 5 != 0)
		{
			System.out.println(" HiTwo");
		}
		if( num % 5 == 0 && num % 2 != 0)
		{
			System.out.println(" HiFive");
		}
		if( num % 2 == 0 && num % 5 == 0)
		{
			System.out.println(" HiTwoHiFive");
		}
		

		

		
	}
}