import java.util.Scanner;

class TipCalculator {
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = sc.nextDouble();

        System.out.print("Enter the gratuity rate: ");
        double rate = sc.nextDouble();

        double tip = subtotal * rate / 100;
        double total = subtotal + tip;

        System.out.println("The tip is " + tip + " and total is " + total);
    }
}
