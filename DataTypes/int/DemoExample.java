public class DemoExample
{
	public static void main(String [] args)
	{

		int num = 3;
		evenOdd(num);

	}
	
	/**
	* @author nana
        * @param num which takes input from user
 	* @version JDK-21
	* */
	
	public static void evenOdd(int num)
	{
		if(num %2 == 0)
		 System.out.println(num + " is Even ");
		else
		 System.out.println(num + " is Odd ");

	}


}