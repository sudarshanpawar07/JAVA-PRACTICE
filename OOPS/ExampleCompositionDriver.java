class Address
{
	String locality;
	String area;
	String city;
	String state;
	int pincode;

	Address(String locality,String area,String city,String state,int pincode)
	{
		this.locality = locality;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}

	public void displayAddress()
	{
		System.out.println("\n Address Details : ");
		System.out.println("locality : "  + locality);
		System.out.println("Area : " + area);
		System.out.println("city : " + city);
		System.out.println("State : " + state);
		System.out.println("Pincode : " + pincode);
	}
}
class Card
{
	String bank;
	String expiryDate;
	int cvv;
	long cardNumber;
	Card(String bank,String expiryDate,int cvv,long cardNumber)
	{
		this.bank = bank;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.cardNumber = cardNumber;

	}

	public void displayCard()
	{
		System.out.println("Card details : ");
		System.out.println("Bank : " + bank);
		System.out.println("Expiry Date : " + expiryDate);
		System.out.println("Cvv Number : " + cvv);
		System.out.println("Card Number : " + cardNumber);
	}
}
class Customer
{
	String name;
	String email;
	long contact;
	Address [] addresses;
	Card card;

	Customer(String name,String email,long contact ,Address [] addresses,Card card)
	{
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.addresses = addresses;
		this.card = card;
	}

	public void displayCustomer()
	{
		System.out.println("Customer Details : ");
		System.out.println("Name : " + name );
		System.out.println("Email : " + email);
		System.out.println("Contact : " + contact);


	}
}
class ExampleCompositionDriver{
	public static void main(String[] args) {

		Address address1 = new Address("JM ROAD ","DECCAN ","Pune","MH",414106);
		Address address2 = new Address("SP ROAD ","DECCAN ","Pune","MH",414106);

		Card card = new Card("SBI","01/27",123,1234_1234_1234l);

		Customer customer = new Customer("Ramesh Kumar","ramesh@gmail.com",9078454678l,new Address[] {address1,address2},card);

		customer.displayCustomer();
		customer.card.displayCard();
		Address [] arr = customer.addresses;
		for (Address ele : arr) 
		{
			ele.displayAddress();
		}

		
	}
	
}