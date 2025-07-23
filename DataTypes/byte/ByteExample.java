class ByteExample
{
	public static void main(String [] args)
	{
		for(int i = 1;i <= 127;i++)
		{
			System.out.println(i + ":" + Integer.toBinaryString(i));
		}
	}
}