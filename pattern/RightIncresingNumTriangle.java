class RightIncresingNumTriangle
{
    public static void main(String[] args)
 {
	int count = 1;
        for (int i = 1; i <= 4; i++)
	 {
            // Print spaces first
            for (int j = 1; j <= 4 - i; j++) 
	   {
                System.out.print(" ");
            }


            // Print numbers from 1 to i
            for (int k = 1; k <= i; k++) 
	    {
                System.out.print(count);
		count++;
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}

/*

output :-
  1
  23
 456
78910

*/