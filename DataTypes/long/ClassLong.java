class ClassLong
{
	public static void main(String [] args)
	{
		byte a = 1;
		short b = 21;
		int c = 3;
		float d = 1.1f;
		double e = 12.3;
		char k = 'z';
		long f = a;
		long g = b;
		long h = c;
		//long i = d;error: incompatible types: possible lossy conversion from float to long
		//long j = e; error: incompatible types: possible lossy conversion from double to long
		long l = k;
		
	}
}