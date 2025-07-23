import java.util.Scanner;
class Grade
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter the Grade : ");
		char grade = sc.next().toUpperCase().charAt(0);
		
		if(grade <'A' || grade > 'F')
		{
			System.out.println(" INVALID GRADE " + grade + "Grade");
			return;
		}
		
		switch(grade)
		{
			case 'A' :
			case 'B' :
			case 'C' :System.out.println("You are passed : " + grade);break;
			case 'D' :
			case 'E' : System.out.println(" Your Grade is too low " + grade + "Grade");
				   System.out.println(" You Have to give Retest " );
				   break;
			case 'F' : System.out.println(" You are Fail : " + grade+ "Grade"); break;


			 
		}
	}
}