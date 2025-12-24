class Unboxing
{
	
	public static void main(String[] args) {

		Integer i = new Integer(1000); // boxing
		int i2 = i.intValue();
		System.out.println(i2 + 10); // un - boxing

		Character c1 = new Character('r'); // boxing 
		char ch = c1.charValue(); // un-boxing
		System.out.println(ch);
		
	}
}