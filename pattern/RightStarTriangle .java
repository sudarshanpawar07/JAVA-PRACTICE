class RightStarTriangle
{
    public static void main(String[] args)
 {
        for (int i = 1; i <= 5; i++)
	 {
            // Print spaces first
            for (int j = 1; j <= 5 - i; j++) 
	   {
                System.out.print(" ");
            }


            // Print numbers from 1 to i
            for (int k = 1; k <= i; k++) 
	    {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
/*
output :-

    *
   **
  ***
 ****
*****

*/