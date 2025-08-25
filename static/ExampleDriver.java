import java.util.Scanner;
class Cred
{
	static String username ;
	static Scanner sc = new Scanner(System.in);
	static
	{	
		System.out.print(" Enter your username : ");
		username = sc.next();
		System.out.println("username : " + username);
		username = encodeUsername(username);
	}
	
	public static String encodeUsername(String username)
	{
		String encode = "";
		for(int i = 0;i<username.length();i++)
		{
			char ch = username.charAt(i);
			if(i%2 != 0) encode+= (ch+0);
			else encode += ch;
			
		}
	
		return encode;
	}
}
class ExampleDriver
{
	public static void main(String [] args)
	{	
		System.out.println(" main() ");
		System.out.println(Cred.username);
	}
		
}