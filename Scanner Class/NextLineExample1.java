import java.util.Scanner;
class NextLineExample1
{
public static void main(String [] args)
{	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the string 1 :");
	
	String  str1 = sc.nextLine(); // hello java
	
	System.out.print("Enter the string 2 : ");
	
	String str2 = sc.next();

	System.out.print("Enter the string 3 : ");

	String str3 = sc.next();// skip

	System.out.print("Enter the string 4: ");

	String str4 = sc.next();// skip

	System.out.print("Enter the string 5 : ");

	String str5 = sc.next();// kuchbhi

		
	System.out.println(" Str 1 : " + str1);
	System.out.println(" Str 2 : " + str2);
	System.out.println(" Str 3 : " + str3);
	System.out.println(" Str 4 : " + str4);
	System.out.println(" Str 5: " + str5);
	




}
}