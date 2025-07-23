import java.util.Scanner;
class Marriage
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
	
		
		
		System.out.print(" Enter your age : ");
		
		 int age = sc.nextInt();

		System.out.print(" Enter your property : ");
		double prop = sc.nextDouble();
		
		if ( age > 21 && prop >= 10000000 )
		{
			System.out.println(" you are eligible  for marriage ");
	
		}
		else{
			System.out.print(" Enter your Surname  : ");
			String surName = sc.next();
			
			if(surName.equalsIgnoreCase("AMBANI"))
			{
				System.out.println(" you are eligible  for marriage ");
			}
			else{
				System.out.println(" you are  not eligible  for marriage ");
			}


		    }
		
		

		
		
	}
}