import java.util.Scanner;

class PrimeNumber {
    static int num;
    static int fact = 1; // start from 1 so we count both 1 and num
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num = sc.nextInt();

        PrimeNumbers(num);

        if (count == 2) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }

    public static void PrimeNumbers(int num) {
        if (fact <= num) {
            if (num % fact == 0) {
                count++;
            }
            fact++;
            PrimeNumbers(num);
        }
    }
}
