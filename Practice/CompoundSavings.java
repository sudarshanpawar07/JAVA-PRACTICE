import java.util.Scanner;

class CompoundSavings {
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double saving = sc.nextDouble();

        double monthlyRate = 0.05 / 12;
        double total = 0;

        for (int i = 0; i < 6; i++) {
            total = (saving + total) * (1 + monthlyRate);
        }

        System.out.println("After the sixth month, the account value is Rs - " + total);
    }
}
