import java.util.Scanner;
class PositiveNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		if(num == 0)
		{
			System.out.println(num + " is Neutral Number");
		}

		if(num > 0)
		{
			System.out.println(num + " is Positive Number");
		}
		
		if(num < 0)
		{
			System.out.println(num + " is Negative Number");
		}

	}
}