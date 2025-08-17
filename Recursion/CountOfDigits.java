import java.util.Scanner;
class CountOfDigits
{	static int count = 0;
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number : ");
		int num = sc.nextInt();
		countOfDigit(num);
		System.out.print(" count of digit is  : " + count);
	}
	public static void countOfDigit(int num)
	{	
		int  rem = num % 10;
		num /= 10;
		count++;
		if(num == 0) return;
		

		countOfDigit(num);
	}
}