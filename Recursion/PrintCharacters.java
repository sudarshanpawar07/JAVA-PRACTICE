class PrintCharacters
{
	static char ch = 'Z';
	public static void main(String [] args)
	{
		printAlphabets();
	}
	
	public static void printAlphabets()
	{
		System.out.print(ch + " ");
		if(ch-- == 'A') return;
			
		printAlphabets();
	}
}