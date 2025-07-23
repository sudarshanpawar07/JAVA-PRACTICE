import java.util.Scanner;
class PesonalInfo
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter your name : " );
		
		String name = sc.nextLine();
	
		System.out.print(" Enter your Email : " );
	
		String email = sc.nextLine();
	
		System.out.print(" Enter your contact number : " );
		
		long contact = sc.nextLong();

		System.out.print(" Enter your year of passing : " );
	
		int yop = sc.nextInt();
		
		System.out.print(" Enter your cgpa : " );
		
		double cgpa = sc.nextDouble();
		
		System.out.println();

		System.out.println(" Name  is : " + name );
		
		System.out.println(" Email  is : " + email );
		
		System.out.println(" Contact   is : " + contact );
	
		System.out.println(" Year of passing  is : " + yop );
	
		System.out.println(" CGPA  is : " + cgpa );







	}
}