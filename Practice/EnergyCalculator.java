import java.util.Scanner;
 class EnergyCalculator {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double m = sc.nextDouble();

        System.out.print("Enter the initial temperature: ");
        double t1 = sc.nextDouble();

        System.out.print("Enter the final temperature: ");
        double t2 = sc.nextDouble();

        double q = m * (t2 - t1) * 4184;
        System.out.println("The energy needed is " + q);
    }
}
