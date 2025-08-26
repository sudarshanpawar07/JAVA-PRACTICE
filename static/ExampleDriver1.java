import java.util.Scanner;

class Cred1 {
    static String username;
    static Scanner sc = new Scanner(System.in);

    static {    
        System.out.print("Enter your username: ");
        username = sc.next();
        System.out.println("Original username: " + username);
        username = encodeUsername(username);
    }
    
    public static String encodeUsername(String username) {
        String encode = "";
        
        for (int i = 0; i < username.length(); i++) {
            char ch1 = username.charAt(i);
            
            // If not a letter, just add as-is
            if (!(ch1 >= 'A' && ch1 <= 'Z' || ch1 >= 'a' && ch1 <= 'z')) {
                encode += ch1;
                continue;
            }
            
            int count = 1;
            for (int j = i + 1; j < username.length(); j++) {
                if (ch1 == username.charAt(j)) {
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            encode += ch1 + "" + count;
        }
        return encode;
    }
}

class ExampleDriver1 {
    public static void main(String [] args) {    
        System.out.println("main()");
        System.out.println(Cred1.username);  
    }
}
