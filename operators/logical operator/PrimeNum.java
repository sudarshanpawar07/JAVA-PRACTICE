import java.util.Scanner;
class PrimeNum
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the number : ");
		int num = sc.nextInt();
			
		boolean op =( num == 2 || num == 3 || num == 5 || num == 7 || num == 11 ||
            	num == 13 || num == 17 || num == 19 || num == 23 || num == 29 ||
            	num == 31 || num == 37 || num == 41 || num == 43 || num == 47 ||
           	num == 53 || num == 59 || num == 61 || num == 67 || num == 71 ||
            	num == 73 || num == 79 || num == 83 || num == 89 || num == 97);
		
		System.out.println(op);
	
		
		
	}
}