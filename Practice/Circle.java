 
class Circle
{
	public static void main (String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print(" Enter the radius : " );
		
		float radius = sc.nextFloat();
		
		final float PI = 3.147f;
		
		float area = PI * (radius * radius);
		
		float perimeter = 2 * PI * radius;
		
		System.out.println(" Radius : " + radius + " cm ");
		
		System.out.println(" Area : " + area + " cm^2");
		
		System.out.println(" Perimeter : " + perimeter + " cm ");


			
		
		
	}
}