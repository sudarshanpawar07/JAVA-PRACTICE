import java.util.Scanner;
class LeapYear
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the Year : ");
		int year = sc.nextInt();
		
		boolean op = ( year % 4 == 0 && year % 100 != 0 ) ||year % 400 == 0;
			
		System.out.println(op);

	}
}