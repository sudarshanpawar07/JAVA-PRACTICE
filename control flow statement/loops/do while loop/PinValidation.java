import java.util.Scanner;
import static java.lang.System.out;

class PinValidation {
    public static void main(String[] args) throws InterruptedException {
        int storedPin = 1234;
        int duration = 5000;

        outerLoop: // label for outer loop
        for (;;) {
            int attempt = 3;
            do {
                out.println();
                out.print("Enter your PIN: ");
                int userPin = new Scanner(System.in).nextInt();

                if (userPin == storedPin) {
                    out.println("PHONE UNLOCKED");
                    break outerLoop; // exit both loops
                } else {
                    attempt--;
                    out.println("Wrong PIN");
                    out.println("Attempts Left: " + attempt);
                }
            } while (attempt != 0);

            out.println();
            out.println("Phone is disabled for " + (duration / 1000) + " seconds.");
            Thread.sleep(duration); // pause for duration
            duration *= 2; // exponential backoff
        }
    }
}
