import java.util.Scanner;
class CountOfDigits
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter The Number : ");
		int num = sc.nextInt();
		
		int origiNum = num;
		int count = 0;
			
		for( ; num != 0;num /= 10)
		{
			count++;
			

		}
		
		System.out.println("Count of digits in this  " + origiNum + " Count is " + count);
	}
}