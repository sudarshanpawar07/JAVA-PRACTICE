class Population
{
	public static void main(String [] args)
	{
		
		long currentPop = 312032486;
		
		long seconds = (365 * 24 * 60 * 60)*5;
		
		long birth = seconds / 7;
		
		long death = seconds / 13;
		long immigrants =  seconds / 45;
		
		long newPop = currentPop + birth - death + immigrants;

		System.out.println(" Current Population : " + currentPop);
		System.out.println(" New Population : " + newPop);

		
		
		
	}
}