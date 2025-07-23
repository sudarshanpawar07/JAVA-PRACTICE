class Vowel
{
	public static void main(String [] args)
	{
		char ch = 0;
		while(ch <= 127)
		{
			switch(ch)
			{
				case 'A','E','I','O','U','a','e','i','o','u' -> System.out.println(ch + " is vowel ");
			}
			
			ch++;
		}
	}
}