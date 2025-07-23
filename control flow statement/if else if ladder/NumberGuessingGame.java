import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalGames = 0;
        int gamesWon = 0;

        for(;;) {
            int botNumber = (int)(Math.random() * 100) + 1;
            int attempts = 0;
            boolean isGuessed = false;

            System.out.println("=== Guess the Number Between 1 to 100 ===");

            while (attempts < 7) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == botNumber) {
                    System.out.println(" Congratulations! You guessed it right in " + attempts + " attempts.");
                    isGuessed = true;
                    gamesWon++;
                    break;
                } else if (userGuess > botNumber) {
                    System.out.println("Too high, try again!");
                } else {
                    System.out.println("Too low, try again!");
                }
            }

            totalGames++;

            if (!isGuessed) {
                System.out.println(" Game Over! The number was: " + botNumber);
            }

            // Ask user if they want to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        // After exiting
        System.out.println("\nYou played " + totalGames + " game(s) and won " + gamesWon + " time(s).");
        System.out.println("Thanks for playing! ");
    }
}
