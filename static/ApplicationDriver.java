import java.util.Scanner;
class ApplicationDriver

{	

	static Scanner sc = new Scanner(System.in);
	static String myPin = System.getenv("mypin");// mypin = 2324
	static
	{
		boolean assumpt = false;
		for(int i= 3;i >= 1;i--)
		{	
			System.out.print(" eneter your pin :");	
			String pin = sc.next();
			if(pin.equals(myPin))
			{
				assumpt = true;
				break;
			}
			else
			{
				System.out.println("invalid pin");
				System.out.println(" Attempt left : " + (i-1));
			}
		}
		if(!assumpt)
		System.exit(0);// terminate the jvm(kills a thread)
	}
	public static void main(String [] args)
	{
		launchapplication();
	}
	
	public static void launchapplication()
	{
		System.out.println();
		System.out.println(" phone pay \n home page ");
	}
}