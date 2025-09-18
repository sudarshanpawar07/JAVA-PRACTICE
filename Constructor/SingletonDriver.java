class ConnectionDataBase
{
	private static ConnectionDataBase obj;
	String username;
	String password;

	private ConnectionDataBase(String username,String password)
	{
		super();
		this.username = username;
		this.password = password;

	}

	public static ConnectionDataBase getInstance(String username,String password)
	{
		if(obj == null)
		{
			obj = new ConnectionDataBase(username,password);
		}

		return obj;
	}

	public  void connectWithDataBase()
	{
		System.out.println(" USER U HAVE CONNECTED WITH DB ");
		System.out.println("DB CRED \n username : " + username + "\n password :" + password);
	}
}
class SingletonDriver
{
	public static void main(String[] args) 
	{
		String username = "admin";
		String password = "admin";

		ConnectionDataBase obj = ConnectionDataBase.getInstance(username,password);
		obj.connectWithDataBase();

		ConnectionDataBase obj1 = ConnectionDataBase.getInstance(username,password);
		obj1.connectWithDataBase();

		
	}
}