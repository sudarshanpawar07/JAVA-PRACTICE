class ExampleFloat
{
	public static void main(String [] args)
	{
		// float a = 3.14; error: incompatible types: possible lossy conversion from double to float
		
		float b  = 1f;
		
		float c  = 123L;
		
		float  d = 'A';
		
		float e = 'A' + 'A';

		// float f = "A" + "A"; error: incompatible types: String cannot be converted to float
		
		// float g = true;  error: incompatible types: boolean cannot be converted to float
		
		float h = 123456789012345678901234567890f;
		
		// float i = 12345678901234567890L; error: integer number too large
		
		byte aa = 1;
		
		short ab = 2;

		int ac = 3;

		long ad = 4;

		float ba = aa;

		float bc = ab;
	
		float bd = ac;
		
		float be = ad;
		
		
		
		
	}
}