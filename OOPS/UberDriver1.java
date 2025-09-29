import java.util.Scanner;
import java.util.ArrayList;
class Driver
{
	private String name;
	private long contact;


	Driver(String name,long contact)
	{
		this.name = name;
		this.contact = contact;

	}

	public void getDriver()
	{
		System.out.println("\n DRIVER INFO ");
		System.out.println("Driver : " + name);
		System.out.println("Contact : " + contact +"\n");
	}
}
class Cab
{
	static int id = 23543;
	private Driver driver;
	private String number;
	private String uberId;
	private String type;
	private int capacity;

	private String status = "AVAIL";
	private String location = "DECCAN";

	String [] typeVehicle = {"hatchback","sedan","suv","muv"};
	int [] vehicleCapacity = {3,4,5,6};

	{
		this.uberId = "UBER"  + id++;
	}

	Cab(String number,String type,Driver driver)
	{
		this.number = number;
		this.type = type.toLowerCase();

		int indx = 0;
		for (String element : typeVehicle) {
			if (type.toLowerCase().equals(element)) {
				break;
				
			}
			indx++;
			
		}
		this.capacity = vehicleCapacity[indx];
		this.driver = driver;
	}

	public void getCabDetails()
	{
		System.out.println("\n CAB DETAILS");
		System.out.println("uberId :" + uberId);
		System.out.println("Status : " + status);
		System.out.println("type : " + type);
		System.out.println("capacity : " + capacity);
		System.out.println("Location : " + location);
		System.out.println("");
	}

	public String getCabNumber()
	{
		return number;
	}

	public Driver getDriver()
	{
		return driver;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String newStatus)
	{
		status = newStatus;
	}

	public int getCapacity()
	{
		return capacity;
	}

	public String getUberId()
	{
		return uberId;
	}
}
class UberDriver1
{
	public static void main(String[] args) {
		Uber uber = new Uber();
		uber.homeModule();
		
	}
}
class Passenger{
	private String name;
	private long contact;
	private String email;
	private String pickUpLocation;
	private String dropLocation;
	private int seats;

	Passenger(String name,long contact,String email,String pickUpLocation,String DropLocation,int seats)
	{
		super();

		this.name = name;
		this.contact = contact;
		this.email = email;
		this.pickUpLocation = pickUpLocation;
		this.seats = seats;

	}
	public String getName()
	{
		return name;
	}

	public void setName(String newName)
	{
		this.name = newName;
	}

	public long getContact()
	{
		return contact;
	}

	public void setContact(long newContact)
	{
		this.contact = newContact;
	}
	public  String getEmail()
	{
		return email;
	}

	public void setEmail(String newEmail)
	{
		this.email = newEmail;
	}

	public String getPickupLocation()
	{
		return pickUpLocation;
	}

	public void setPickupLocation(String newPickupLocation)
	{
		this.pickUpLocation = newPickupLocation;
	}

	public String getDropLocation()
	{
		return dropLocation;
	}

	public void setDropLocation(String newDropLocation)
	{
		this.dropLocation = newDropLocation;
	}

	public int getSeats()
	{
		return this.seats;
	}
	public void setSeats(int newSeats)
	{
		this.seats = newSeats;
	}

}
class Uber
{
	ArrayList <Cab> listCabs = new ArrayList<Cab>();
	Passenger passenger;
	Cab currentCab;

	{
		Cab cab1 = new Cab("MH-12-AA-1234","sedan",new Driver("Ramesh Kumar",908786590L));
		Cab cab2 = new Cab("MH-01-AA-1234","hatchback",new Driver("Suresh Kumar",908787898L));
		Cab cab3 = new Cab("MH-02-AA-1234","suv",new Driver("Ganesh Kumar",908787268L));
		Cab cab4 = new Cab("MH-14-AA-1234","sedan",new Driver("Ritesh Kumar",908891248L));
		Cab cab5 = new Cab("MH-22-AA-1234","muv",new Driver("Kalpesh Kumar",9087823778L));

		listCabs.add(cab1);
		listCabs.add(cab2);
		listCabs.add(cab3);
		listCabs.add(cab4);
		listCabs.add(cab5);
	}

	{
		System.out.println("Passenger Details : ");
		System.out.print("Name :");
		String name = new Scanner(System.in).next();

		System.out.print("Contact :");
		long contact = new Scanner(System.in).nextLong();

		System.out.print("Email : ");
		String email = new Scanner(System.in).next();

		System.out.print("Picckup Location : ");
		String pickup = new Scanner(System.in).next();

		System.out.print("Drop Location : ");
		String drop = new Scanner(System.in).nextLine();

		System.out.print("Number of People : ");
		int seats = new Scanner(System.in).nextInt();

		this.passenger = new Passenger(name,contact,email,pickup,drop,seats);
	}
	public void homeModule()
	{
		for(;;)
		{
			System.out.println("\n WELCOME \n");
			System.out.println("1.BOOK A RIDE ");
			System.out.println("2.CANCLE A RIDE ");
			System.out.println("3.RIDE HISTORY ");
			System.out.println("4. LOG OUT \n");
			System.out.print("Enter your Response : ");
			int response = new Scanner(System.in).nextInt();

			switch(response)
			{
			case 1 -> bookRide();
			case 2 -> cancleRide();
			case 3 -> rideHistory();
			case 4 ->{
				System.out.println(" THANK YOU FOR USING UBER ");
				System.exit(0);
			}
			default-> System.out.println("Invalid Response");
			}
		}
	}

	public void bookRide()
	{
		System.out.println("\n BOOK A RIDE MODULE \n");
		for(Cab ele : listCabs)
		{
			if(ele.getStatus() == "AVAIL" && passenger.getSeats() <= ele.getCapacity())
			{
				ele.getCabDetails();
			}
		}
		System.out.print("\n Enter the uberId :");
		String uberId = new Scanner(System.in).next();
		boolean assump = false;

		for(Cab ele : listCabs)
		{
			if(ele.getUberId().equals(uberId))
			{
				System.out.println("YOUR RIDE HAS BEEN CONFIRMED");
				currentCab = ele;
				assump = true;
				System.out.println("Your ride Details ");
				ele.getCabDetails();
				System.out.println("Cab Number : " + ele.getCabNumber());
				ele.getDriver().getDriver();
				break;
			}

		}
		if(!assump)
		{
			System.out.println("\n Invalid uberId \n");
		}

	}

	public void cancleRide()
	{
		if(currentCab == null)
		{
			System.out.println("\n No ride has been booked \n");
			return;
		}
		System.out.println("\n Cancle - a - ride module \n");
		System.out.println("Your ride Details : ");
		currentCab.getCabDetails();
		System.out.println("Cab Number : " +currentCab.getCabNumber());
		currentCab.getDriver().getDriver();

		System.out.println(" DO U WANT TO CANCLE YOUR RIDE (YES / NO) :");
		String resp = new Scanner(System.in).next();

		if(resp.equalsIgnoreCase("YES"))
		{
			System.out.println("YOUR RIDE HAS BEEN CANCLED ");
			currentCab = null;
		}

	}

	public void rideHistory()
	{
		System.out.println("\n RIDE - HISTORY MODULE \n");
	}



}