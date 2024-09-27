import java.util.Random;
import java.util.Scanner;

public class Number_Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;  // Generate a random number between 1 and 100
            int noOfAttempts = 0;
            int maxAttempts = 10;  // Limit the number of attempts
            boolean guessedCorrectly = false;

            System.out.println("Pick a number between 1 and 100. Can you guess it?");
            System.out.println("You have " + maxAttempts + " attempts to guess the number.");

            while (noOfAttempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int playerGuess = scanner.nextInt();
                noOfAttempts++;

                if (playerGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    guessedCorrectly = true;
                    break;
                } else if (playerGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }

                System.out.println("Attempts remaining: " + (maxAttempts - noOfAttempts));
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + numberToGuess);
            }

            // Calculate score based on attempts
            int score = guessedCorrectly ? (maxAttempts - noOfAttempts + 1) * 10 : 0;
            totalScore += score;
            System.out.println("Your score this round: " + score);
            System.out.println("Total score: " + totalScore);

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next();
            playAgain = playAgainResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your total score was: " + totalScore);
        scanner.close();
    }
}
