class Vowel
{
	public static void main(String [] args)
	{	
		// vowels upper & lowercase alphabet
		char ch = 0;
		do
		{
			switch(ch)
			{
				case 'A','E','I','O','U','a','e','i','o','u' -> System.out.println(ch + " is Vowel ");
			};
			ch++;
		}while(ch <= 127);
	}
}