import java.util.*;
class PercentageUsingVarArgs
{
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);

		System.out.print("Enter the name : ");
		String name = sc.next();

		System.out.print("Enter the contact : " );
		long contact = sc.nextLong();
		System.out.print("Enter the marks sub1 : ");
		int sub1 = sc.nextInt();
		
		System.out.print("Enter the marks sub2 : ");
		int sub2= sc.nextInt();
		
		System.out.print("Enter the marks sub3 : ");
		int sub3 = sc.nextInt();
		
		System.out.print("Enter the marks sub4 : ");
		int sub4 = sc.nextInt();
		
		System.out.print("Enter the marks sub5 : ");
		int sub5 = sc.nextInt();
		
		
	marksheet(name,contact,sub1,sub2,sub3,sub4,sub5);
		
	}

	public static void marksheet(String name, long contact,int ... marks)
	{
		System.out.println("Name : " + name);
		System.out.println("contact : " + contact);

		int sum = 0;
		for (int i = 0 ; i < marks.length ;i++ ) {

			sum += marks[i];
		}

		System.out.println("marksheet Of "+ name + " is  ");
		double per = (sum / 500.0) * 100;

		System.out.println("Percentage : " + per);


	}

}