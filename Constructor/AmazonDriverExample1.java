class Address {
    String lane;
    String locality;
    String city;
    int pincode;

    Address(String lane, String locality, String city, int pincode) {
        this.lane = lane;
        this.locality = locality;
        this.city = city;
        this.pincode = pincode;
    }

    public void displayAddress() {
        System.out.println("\n Address ");
        System.out.println("Lane : " + lane);
        System.out.println("locality : " + locality);
        System.out.println("City : " + city);
        System.out.println("Pincode : " + pincode);
    }
}

class Amazon {
    String username;
    String password;
    long contact;
    String email;
    Address address;

    Amazon() {
        super();
    }

    Amazon(String username, String password, long contact, String email, Address address) {
        super();
        this.username = username;
        this.password = password;
        this.contact = contact;
        this.email = email;
        this.address = address;
    }

    public void dispalyAmazonInfo() {
        System.out.println("\n Amazon Info ");
        System.out.println("username : " + username);
        System.out.println("password : " + password);
        System.out.println("contact : " + contact);
        System.out.println("Email : " + email);
        address.displayAddress();
    }
}

class Bank {
    String name;
    String ifscCode;
    long accountNum;
    double balance;

    Bank(String name, String ifscCode, double balance) {
        this.name = name;
        this.ifscCode = ifscCode;
        this.accountNum = 5698876L;
        this.balance = balance;
    }

    public void displayBank() {
        System.out.println("\n Bank details ");
        System.out.println("name : " + name);
        System.out.println("ifscCode : " + ifscCode);
        System.out.println("Account Number : " + accountNum);
        System.out.println("Balance : " + balance);
    }
}

class AmazonPay extends Amazon {
    String upiId;
    Bank bank;
    int pin;
    double wallet;

    AmazonPay() {
    }

    AmazonPay(String upiId, Bank bank, int pin, double wallet,
              String username, String password, long contact, String email, Address address) {
        super(username, password, contact, email, address);
        this.upiId = upiId;
        this.bank = bank;
        this.pin = pin;
        this.wallet = wallet;
    }

    // copy constructor
    AmazonPay(AmazonPay oldObj)
    {
        super(oldObj.username,oldObj.password,oldObj.contact,oldObj.email,oldObj.address);
        this.upiId = oldObj.upiId;
        this.bank = oldObj.bank;
        this.pin = oldObj.pin;
        this.wallet = oldObj.wallet;

    }

    public void displayAmazonPay() {
        dispalyAmazonInfo();
        System.out.println("\n AmazonPay ");
        System.out.println("upi id : " + upiId);
        System.out.println(" Pin : " + pin);
        System.out.println("wallet : " + wallet + "rs.");
        bank.displayBank();
    }
}

class AmazonDriverExample1 {
    public static void main(String[] args) {
        Address address = new Address("JM ROAD ", "Deccan", "Pune", 411005);
        Bank bank = new Bank("ramesh kumar", "SBI0001232", 50000);

        AmazonPay oldObj = new AmazonPay(
                "7876@ybl", bank, 12321, 1500,
                "ramesh kumar", "ramesh@123", 9057656557L, "rameshkumar@gmail.com",
                address
        );

        oldObj.displayAmazonPay();

        System.out.println("\n CopyObject : \n");
        AmazonPay copyObj = new AmazonPay(oldObj);

        copyObj.displayAmazonPay();

        System.out.println(" org obj of change ");

        oldObj.displayAmazonPay();
    }
}
