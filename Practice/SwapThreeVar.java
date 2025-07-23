import java.util.Scanner;
class SwapThreeVar
{
	public static void main(String  [] args)
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.print(" Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.print(" Enter the second Number : ");
		int num2 = sc.nextInt();
		
		System.out.println(" BEFORE SWAPPING ");
		System.out.println(" Num1 : " + num1);
      		System.out.println(" Num2 : " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println();
		System.out.println(" AFTER SWAPPING ");
		System.out.println(" Num1 : " + num1);
      		System.out.println(" Num2 : " + num2);


		
		
	
		
		
	}
}