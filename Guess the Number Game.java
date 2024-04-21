import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int maxRange = 100; // Maximum number to guess (inclusive)
        int secretNumber = random.nextInt(maxRange) + 1; // Generate a random number between 1 and maxRange
        
        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and " + maxRange + ". Can you guess it?");
        
        int attempts = 0;
        boolean guessedCorrectly = false;
        
        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempts + " attempts.");
                guessedCorrectly = true;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        
        scanner.close();
    }
}
