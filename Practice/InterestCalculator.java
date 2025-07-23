import java.util.Scanner;



class InterestCalculator 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter interest rate (e.g., 3 for 3%): ");
        double rate = sc.nextDouble();

        double interest = balance * (rate / 1200);
        System.out.println("The interest is " + interest);
    }
}
