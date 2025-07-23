import java.util.Scanner;
class DrivingCost 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the driving distance: ");
        double distance = sc.nextDouble();

        System.out.print("Enter miles per gallon: ");
        double mpg = cs.nextDouble();

        System.out.print("Enter price per gallon: ");
        double price = cs.nextDouble();

        double cost = (distance / mpg) * price;
        System.out.println("The cost of driving is : " + cost);
    }
}
