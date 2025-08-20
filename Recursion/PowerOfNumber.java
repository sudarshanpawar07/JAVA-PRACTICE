import java.util.Scanner;
class PowerOfNumber
{
	static int result = 1;
	public static void main(String [] args)
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Number : ");
		int num = sc.nextInt();
		
		System.out.print(" enter the Power : ");
		int pow = sc.nextInt();
		
		result = power(num,pow);
		System.out.println(num +  " ^ " + pow  + " is : " + result);
		
		
		
		
	}
	
	public static int power( int num, int pow)
	{	
              	result *= num;
		pow--;
		if(pow == 0) return result;
		power(num,pow);
		return result;
	}
}