import java.util.Scanner;
class Season
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter a month (Mon) :");
		String month = sc.next().toUpperCase().substring(0,3);
		
		switch(month)
		{
			case "NOV" :
			case "DEC" :
			case "JAN" :
			case "FEB" :System.out.println(month + " it's WINTER ");break;
			case "MAR" :
			case "APR" :
			case "MAY" :
			case "JUN" :System.out.println(month + " it's SUMMER ");break;

			case "JUL" :
			case "AUG" :
			case "SEP" :
			case "OCT" :System.out.println(month + " it's MONSOON ");break;

			default :System.out.println(" INVALID MONTH ");
			break;
		}
	}
}