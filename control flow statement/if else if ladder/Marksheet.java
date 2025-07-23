import java.util.Scanner;
class Marksheet
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print(" Enter the marks : ");
		int marks = sc.nextInt();
		int totalMarks = 500;
		
		if(marks < 0 ||  marks > 500)
		{
			System.out.println(" Invalid Marks  Entered " + marks);
			return;

		} 
		
		String grade = ""; 
		
		float per = (marks * 100)/totalMarks;

		if(per >= 90)
		{
			grade = "O";
			
		}
		else if( per >= 75)
		{
			grade = "A";
		}
		else if( per >= 60)
		{
			grade = "B";
		}
		else if( per >= 50)
		{
			grade = "C";
		}
		else if( per >= 35)
		{
			grade = "D";
		}
		else
		{
			grade = "F";
		}
		
	System.out.print(" Percentage  is : " + per);
	System.out.print("  Grade : " + grade);




		
	

	}
}