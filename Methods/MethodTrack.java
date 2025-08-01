class MethodTrack
{
	public static void main(String [] args)
	{
		System.out.println(" main starts ");
		
		ramesh("hello");

		System.out.println(" main starts ");

	}
		public static void ramesh(String str)
		{
			System.out.println(" ramesh starts ");
		
			int op = suresh();

			System.out.println(" ramesh starts ");
			
			
		}
		
		public static int suresh()
		{
			System.out.println(" suresh starts ");
		
			 ganesh(123);

			System.out.println(" suresh ends ");
			
			return 123;
		}

		
		


		public static void ganesh(int num)
		{
			System.out.println(" ganesh starts ");

			System.out.println(" data : " + num);
		
			System.out.println(" ganesh ends ");

		}

}