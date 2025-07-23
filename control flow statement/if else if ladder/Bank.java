
import java.util.Scanner; 
class Bank
{
	public static void main(String [] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======= Simple Banking System =======");
		System.out.println();


	
		System.out.print(" Enter your Name : ");
		String name = sc.nextLine();
		
		System.out.print(" Enter your Account Number : ");
		int  accountNum = sc.nextInt();
		
		System.out.print(" Enter your Initial Balance ");
		int initialBal = sc.nextInt();
		
		for( ; ; )
		{	

			System.out.println();
			
			System.out.println("===== Welcome "+ name +"(Acc No: " + accountNum + ") =====");
			System.out.println();
			System.out.println(" 1. Deposit Money ");
			System.out.println(" 2. Withdraw Money ");
			System.out.println(" 3. Check Balance ");
			System.out.println(" 4. Exit  ");
			
			System.out.print(" Enter what u want to do : ");
			int userResp = sc.nextInt();
			
					
			if(userResp == 1)
			{
				System.out.print(" Enter how much amount you want to deposit : ");
				int depositAmount = sc.nextInt();

				if(depositAmount > 0)
				{
					initialBal = initialBal + depositAmount;
					
					System.out.println( depositAmount + " RS is creadited  sucessfully ! ");
				
				}
								
			}
			else if(userResp == 2)
			{
				System.out.print(" Enter how much amount you want to withdraw : ");
				int withdrawAmount = sc.nextInt();
				
				if(withdrawAmount <= initialBal)
				{
					initialBal = initialBal -  withdrawAmount;
					System.out.println(withdrawAmount + " RS debited  Successfully ! ");
					System.out.println(initialBal + " RS is Your Available Balance ");


					


				}
				else
				{
					System.out.println(" Insufficient Balance ");
				}
			}
			else if(userResp == 3)
			{
				System.out.println(initialBal + " RS is Your Available Balance ");



			}
			else if(userResp == 4)
			{
				 System.out.println("=====================================");
   				 System.out.println(" THANK YOU, " + name + "! VISIT AGAIN :)");
   				 System.out.println("=====================================");
    				 break;
			}
			else
			{
				System.out.println(" Please Enter valid operation ");
			}
			
			
	
		}
		
		
		
		
		
	}
}