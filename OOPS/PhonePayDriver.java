import java.util.*;
class PhonePay
{
	private double balance = 30000;
	
	int storePin = 1234;
	
	public double getBalance()
	{
		return balance;
	}
}
class PhonePayDriver
{
	public static void main(String [] args)
	{
		runApplication();
	}
	public static void runApplication()
	{
		PhonePay obj = new PhonePay();
		System.out.print("Enter the Pin :");
		int userPin = new Scanner(System.in).0nextInt();
		
		if(userPin == obj.storePin)
		{
			System.out.println(obj.getBalance());

		}
		else{
			System.out.println(" Invalid Pin ");
		}
		
	
	}

	
}