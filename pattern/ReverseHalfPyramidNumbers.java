class ReverseHalfPyramidNumbers
{
	public static void main(String [] args)
	{
		int n = 5;
		for( int i = 1 ; i <= 5; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				System.out.print(j);
				
			}
			n--;
			System.out.println();
		}
	}
}
/* 
second way to write it :-

for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
*/

/*
output:-

12345
1234
123
12
1
*/