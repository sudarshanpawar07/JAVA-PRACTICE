class ConnectionDataBase
{
    static String userName;
    static String password;
    static String dbname;
    static String serverName;
    static int localhost;
    
    static {
        userName = System.getenv("username");  // Environment variables
        password = System.getenv("pass");
        dbname = System.getenv("dbname");
        serverName = "MySQL";
        localhost = 3306;
    }
    
    public static boolean generateUrl(String user, String pass, String db) {
        if(user.equals(userName) &&
           password.equals(pass) && 
           db.equals(dbname)) {
            return true;
        }
        return false;
    }
}

class ApplicationExample
{
    static {
        System.out.println("DRIVER LOADED");
        System.out.println("Connection Established Attempting...");

        // Pass expected values
        if(ConnectionDataBase.generateUrl("username", "pass", "dbname")) {
            System.out.println("DB CONNECTION ESTABLISHED");
        } else {
            System.out.println("DB CONNECTION FAILED");
            System.exit(0);
        }
    }

    public static void main(String [] args) {
        launchApplication();    
    }
    
    public static void launchApplication() {    
        for(;;) {    
            System.out.println("Home Page");    
            System.out.println("Features");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Logout");
            System.out.println();    
            
            int opt = new java.util.Scanner(System.in).nextInt();
            
            switch(opt) {        
                case 1,2,3 -> {
                    System.out.println("IMPLEMENT SOON");
                }
                case 4 -> {
                    System.out.println("LOGOUT SUCCESSFUL");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option");
            }
        }    
    }
}
