
class Information
{
		static String name;
		static int age;
		static String stream;
		static int passOut;
		sattic double cgpa ;

	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print(" Enter name  : ");
		name = sc.next();
		
		System.out.print(" Enter your age   : ");
		age = sc.nextInt();
		
		System.out.print(" Enter your Stream : ");
		stream = sc.next();
		
		System.out.print(" Enter cgpa : ");
		cgpa = nextDouble();

		System.out.print(" Enter your passout year : ");
		passOut = sc.nextInt();

					
		personalInfo();

	}
			
	
	public static void personalInfo()
	{
		System.out.println(" ---------DETAILS OF PERSON --------");

		System.out.println(" Name  is : " + name);

		System.out.println(" Age is : " + age);
		
		System.out.println(" Stream  is : " + stream);
		
		System.out.println(" passout  year is : " + name);
		
		System.out.print("  cgpa  is : " + cgpa);
		
		


	}

	
}