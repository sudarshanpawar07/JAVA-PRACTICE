import java.util.Scanner;
class SlalaryIncrement
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter your salary : ");
		
		double salary = sc.nextDouble();
		double dupSal = salary;
		
		System.out.print(" Enter your Score : ");
		int score = sc.nextInt();
		
		if ( score < 0 || score > 100)
		{
			System.out.println(" INVALID SCORE " + score + " ENTERED" );

			return ;
		}
		if( score >= 90)
		{
			System.out.println(" your  Salary  is revised by 3% ");
			salary = salary + (salary *0.03);

		}
		else{
			System.out.println(" your salary  is revised  by 1% ");
			salary = salary + (salary *0.01);


		    }
		
		System.out.println(" Initial Salary : " + dupSal);
		System.out.println(" Revised Salary : " + salary);

		
		
		
	}
}