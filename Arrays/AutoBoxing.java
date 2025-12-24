class AutoBoxing
{
	public static void main(String[] args) {

		Integer i = 1234; // Auto-boxing
		System.out.println(i.toString());
		int i2 = i.intValue(); // Auto-unbxing
		System.out.println(i2);
		Long l = 1012l; // auto- boxing
		System.out.println(l.toString());


		long l2 = l;   // Auto-unboxing
		System.out.println(l2);


		
	}
	
}