import java.util.Scanner;
class Marker
{
	String brand;
	String color;
	double price;
	Marker(String brand, String color,double price)
	{
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String toString()
	{
		return "Brand : " + brand + " ,Color : " + color + " ,Price : "+ price;
	}
}
class MarkerExample
{
	public static void main(String[] args) {

		Marker m1 = new Marker("camlin","black",25.10);
		Marker m2 = new Marker("doms","blue",30.10);
		Marker m3 = new Marker("camlin","red",35.10);
		Marker m4=  new Marker("doms","green",28.10);

		Marker [] Markers = {m1,m2,m3,m4};

		for (Marker ele : Markers) {
			System.out.println(ele);
			
		}


		for (; ; ) {


			System.out.println("\n Sort dataset on the basis various Factor .\n");
			System.out.println("\n 1.Brand A :  ");
			System.out.println("\n 2.Brand D :  ");
			System.out.println("\n 3.Color A :  ");
			System.out.println("\n 4.Color D :  ");
			System.out.println("\n 5.Price A :  ");
			System.out.println("\n 6.Price D :  ");

			System.out.println("\n Enter your Option : ");

			switch(new Scanner(System.in).nextInt())
			{
				case 1 -> brandAscending(Markers,Markers.length);
				case 2 -> brandDescending(Markers,Markers.length);
				case 3 -> colorAscending(Markers,Markers.length);
				case 4 -> colorDescending(Markers,Markers.length);
				case 5 -> priceAscending(Markers,Markers.length);
				case 6 -> priceDescending(Markers,Markers.length);
				default -> System.out.println(" \n INVLID Option ! ");

			}

			for (Marker ele : Markers) {
			System.out.println(ele);
			
		}

		}

		
	}
	public static void brandAscending(Marker []arr, int n)
	{

		for(int i = 0; i< n-1;i++)
		{
			for (int j = i+1;j < n ;j++ ) {
				if(arr[i].brand.compareTo(arr[j].brand) > 0)
				{
					Marker temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
				}
				
			}
		}

	}

	public static void brandDescending(Marker []arr, int n)
	{

		for(int i = 0; i< n-1;i++)
		{
			for (int j = i+1;j < n ;j++ ) {
				if(arr[i].brand.compareTo(arr[j].brand) < 0)
				{
					Marker temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
				}
				
			}
		}

	}

	public static void colorAscending(Marker []arr, int n)
	{

		for(int i = 0; i< n-1;i++)
		{
			for (int j = i+1;j < n ;j++ ) {
				if(arr[i].color.compareTo(arr[j].color) > 0)
				{
					Marker temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
				}
				
			}
		}

	}
	
	public static void colorDescending(Marker []arr, int n)
	{

		for(int i = 0; i< n-1;i++)
		{
			for (int j = i+1;j < n ;j++ ) {
				if(arr[i].color.compareTo(arr[j].color) < 0)
				{
					Marker temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
				}
				
			}
		}

	}

	public static void priceAscending(Marker []arr, int n)
	{

		for(int i = 0; i< n-1;i++)
		{
			for (int j = i+1;j < n ;j++ ) {
				if(arr[i].price > arr[j].price) 
				{
					Marker temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
				}
				
			}
		}

	}

	public static void priceDescending(Marker []arr, int n)
	{

		for(int i = 0; i< n-1;i++)
		{
			for (int j = i+1;j < n ;j++ ) {
				if(arr[i].price < arr[j].price) 
				{
					Marker temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp; 
				}
				
			}
		}

	}

}