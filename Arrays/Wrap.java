class Wrap
{
	public static void main(String[] args) {
		
		Integer i = new Integer(234);
		Integer  i2 = new Integer(234);

		System.out.println(i1 == i2); // false

		System.out.println(i1.equals(i2)); //true


		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());

	}
	
}