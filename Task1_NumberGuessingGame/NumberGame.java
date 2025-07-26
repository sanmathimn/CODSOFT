import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxAttempts = 15;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100.");

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (" + (maxAttempts - attempts) + " attempts left): ");
                int userGuess;

                // Validate integer input
                if (sc.hasNextInt()) {
                    userGuess = sc.nextInt();
                } else {
                    System.out.println("Please enter a valid number.");
                    sc.next(); // consume invalid input
                    continue;
                }

                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts.");
                    score++;
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("You've used all attempts. The number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            sc.nextLine(); // consume leftover newline
            String userResponse = sc.nextLine().toLowerCase();

            if (!userResponse.equals("yes") && !userResponse.equals("y")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! Final Score: " + score);
        sc.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxAttempts = 15;
        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between 1 and 100.");

        while (playAgain) {
            int numberToGuess = rand.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (" + (maxAttempts - attempts) + " attempts left): ");
                int userGuess;

                // Validate integer input
                if (sc.hasNextInt()) {
                    userGuess = sc.nextInt();
                } else {
                    System.out.println("Please enter a valid number.");
                    sc.next(); // consume invalid input
                    continue;
                }

                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Correct! You've guessed the number in " + attempts + " attempts.");
                    score++;
                    hasGuessedCorrectly = true;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Too low! Try again.");
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("You've used all attempts. The number was: " + numberToGuess);
            }

            System.out.println("Your current score: " + score);

            System.out.print("Do you want to play again? (yes/no): ");
            sc.nextLine(); // consume leftover newline
            String userResponse = sc.nextLine().toLowerCase();

            if (!userResponse.equals("yes") && !userResponse.equals("y")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing! Final Score: " + score);
        sc.close();
    }
}

