
import java.util.Scanner;

class PalindromeString 
{
    	static String str;   
    	static String rev = ""; 

    	public static void main(String[] args) 
	{
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Enter the data: ");
       		 str = sc.next();


       		 stringReverse(0);

        	if (str.equals(rev)) 
		{
            		System.out.println(str + " is palindrome");
       		}
		 else 
		{
            		System.out.println(str + " is not palindrome");
       		}

     
    	}

        static void stringReverse(int i)
	 {
        	if (i == str.length())
	 	{
            		return; 
         	}
        	char ch = str.charAt(i);
        	stringReverse(i + 1); 
        	rev = rev + ch; 
    	}
}
