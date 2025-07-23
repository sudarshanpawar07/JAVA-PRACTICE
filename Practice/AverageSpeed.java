class AverageSpeed
{
	public static void main(String [] args)
	{
		float miles = 24;
		
		float totalDistance = miles * 1.6f;
		
		float hour = 1;
			
		float minHour = 40/60f;
			
		float secHour = 35/3600f;
		
		float avgspeed = totalDistance /(hour + minHour + secHour);
		
	
		System.out.println(" total Distance : " + totalDistance);
		System.out.println(" Average Speed : " + avgspeed);

	}
}