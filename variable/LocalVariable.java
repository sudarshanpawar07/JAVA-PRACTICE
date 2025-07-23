class LocalVariable
{
	static  String str = "Global Var";
	public static void main(String [] args)
	{
		String str = "Local Var";
		
		System.out.println(str);
		
		System.out.println(LocalVariable.str);
	}
}