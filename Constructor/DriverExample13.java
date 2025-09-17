class Google
{
	String firstName;
	String lastName;
	String email;
	long contact;
	String password;
	String dob;
	String gender;

	Google(String firstName,String lastName,String email,long contact ,String password,String dob,String gender)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.password = password;
		this.dob = dob;
		this.gender = gender;
	}

	public void displayGoogle()
	{
		System.out.println("GOOGLE ACCOUNT DETAILS ");
		System.out.println("username : " + firstName + " " + lastName);
		System.out.println("Email : " + email);
		System.out.println("contact : " + contact);
		System.out.println("password : " + password);
		System.out.println("dob : " + dob );
		System.out.println("gender : " + gender);
	}
}

class Bank
{
	String name;
	long number;
	double balance;
	Bank(String name,long number,double balance)
	{
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	public void displayBank()
	{
		System.out.println("\n Bank Details : ");
		System.out.println("Name : " + name);
		System.out.println("Number : " + number);
		System.out.println("balance : " + balance);
	}
}

class GooglePay extends Google
{
	long contact1;
	String upiId;
	Bank bank = new Bank("SBI",90753863l,89000);
	int pin;

	GooglePay(String firstName,String lastName,String email,long contact ,String password,
			  String dob,String gender,long contact1,String upiId,int pin )
	{
		super(firstName, lastName, email, contact , password, dob, gender);
		this.contact1 = contact1;
		this.upiId = upiId;
		this.pin = pin;
	}

	public void displayGooglePay()
	{
		displayGoogle();
		System.out.println("\n GooglePay Details : ");
		System.out.println("contact : " + contact);
		System.out.println("upiId : " + upiId);
		System.out.println(" pin : " + pin + "\n");
		bank.displayBank();
	}
}

class GoogleMeet extends Google
{
	String hostName;
	String schedule;
	String link;
	String id;
	final int CAPACITY = 100;
	int join;

	GoogleMeet(String firstName, String lastName, String email, long contact, String password,
	           String dob, String gender, String hostName, String schedule, String link, String id, int join)
	{
		super(firstName, lastName, email, contact, password, dob, gender);
		this.hostName = hostName;
		this.schedule = schedule;
		this.link = link;
		this.id = id;
		this.join = join;
	}

	public void displayGoogleMeet()
	{
		displayGoogle();
		System.out.println("\nGoogle Meet Details:");
		System.out.println("Host Name : " + hostName);
		System.out.println("Schedule  : " + schedule);
		System.out.println("Meeting ID: " + id);
		System.out.println("Link      : " + link);
		System.out.println("Joined    : " + join + "/" + CAPACITY);
	}
}

class GoogleClassroom extends Google
{
	String subject;
	String name;
	String code;
	String trainer;
	int numberStudents;

	GoogleClassroom(String firstName, String lastName, String email, long contact, String password,
	                String dob, String gender, String subject, String name, String code, String trainer, int numberStudents)
	{
		super(firstName, lastName, email, contact, password, dob, gender);
		this.subject = subject;
		this.name = name;
		this.code = code;
		this.trainer = trainer;
		this.numberStudents = numberStudents;
	}

	public void displayGoogleClassroom()
	{
		displayGoogle();
		System.out.println("\nGoogle Classroom Details:");
		System.out.println("Subject        : " + subject);
		System.out.println("Class Name     : " + name);
		System.out.println("Class Code     : " + code);
		System.out.println("Trainer        : " + trainer);
		System.out.println("No. of Students: " + numberStudents);
	}
}

public class DriverExample13
{
	public static void main(String[] args) {
		GooglePay obj1 = new GooglePay("Ramesh","kumar","rameshkumar@gmail.com",90873654233l,"ramesh@123","01/10/2000","Male",797564667l,"7975@ybl",1234);
		obj1.displayGooglePay();

		GoogleMeet meet = new GoogleMeet("Sita","Sharma","sita@gmail.com",9876543210l,"sita@123","12/05/1998","Female",
		                                 "Sita Sharma","20/09/2025 10:00AM","meet.google.com/xyz123","MEET123",45);
		meet.displayGoogleMeet();

		GoogleClassroom classroom = new GoogleClassroom("Amit","Verma","amit@gmail.com",9123456789l,"amit@123","15/03/1999","Male",
		                                                "Java Programming","Java Batch Sept","JAV123","Prof. Mehta",50);
		classroom.displayGoogleClassroom();
	}
}
