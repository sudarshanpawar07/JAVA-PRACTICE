class LocalScope
{
	public static void main(String [] args)
	{
		int a = 10;
		System.out.println(a);

		{
			int b = 20;

			System.out.println(b);
		} 

	}
}