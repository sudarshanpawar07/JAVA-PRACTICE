class Series
{
	public static void main(String [] args)
	{
		// display the alternate alphabets A C E G I K M O Q S U W Y

		char AlternateAlpha = 65;
		
		do
		{
			System.out.print( AlternateAlpha + " ");
			AlternateAlpha += 2;
		}
		while(AlternateAlpha <= 90);
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
		
		// display the this series A C F J O U
		int step = 1;
		char ch = 65;
		
		do
		{
			System.out.print(ch + " ");
			step++;
			ch += step;
		}while(ch <= 90);
		
		System.out.println();
		System.out.println("-------------------------------------------------------");
	}
}