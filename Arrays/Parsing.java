class Parsing
{
	public static void main(String[] args) {
		String s1 = "34534";

		int i = Integer.parseInt(s1);
		System.out.println(i);

		String s2 = "345.025";
		double d = Double.parseDouble(s2);

		System.out.println(d);

		String s3 = "390.21f";
		float f = Float.parseFloat(s3);
		System.out.println(f);

		// String s4 =  "123401l";
		// long l = Long.parseLong(s4); // NumberFormatException.


		
	}
}