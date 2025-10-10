class Amazon
{
	private String userName;
	private String address;
	private int password;
	private long contact;

	Amazon(String userName ,String address,int password,long contact)
	{
		super();
		this.userName = userName;
		this.address = address;
		this.password = password;
		this.contact = contact;
	}


	 public void getAmazon()
	 {
	 	System.out.println("\n Amazon info ");
	 	System.out.println("UserName : " + userName);
	 	System.out.println("Address : " + address);
	 	System.out.println("Contact  : " + contact);
	 }
}
class AmazonPrime extends Amazon
{
	private String [] profiles;
	private String sub;
	private int password;
	private  double price;
	private int users;

	AmazonPrime(String userName ,String address,int password,long contact,
		String [] profiles,String sub,double price,int users,int password1)
	{
		super(userName ,address,password,contact);
		this.profiles = profiles;
		this.sub = sub;
		this.price = price;
		this.users = users; 
		this.password = password1;
	}

	public void getAmazonPrime()
	{
		System.out.println("\n Amazon Prime Info ");
		System.out.print("Profiles");

		for (int  i = 0 ; i < profiles.length; i++ )
		{
			System.out.println(profiles[i]);
		}
		System.out.println("password : " + password);
		System.out.println("Users : " + users);
		System.out.println("Price : " + price);
		System.out.println("subscription : " + sub);

	}

}
class SingleInheritance1{
	public static void main(String[] args) {
		
		String [] profiles = {"Profile1" ,"Profile2"};
		AmazonPrime obj = new AmazonPrime("sudarshan","at pune",1234,9075386378l,profiles,"Yearly ",599,2,9075);
		obj.getAmazon();
		obj.getAmazonPrime();

	}
	
}