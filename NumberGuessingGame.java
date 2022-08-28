import java.util.Arrays;
import java.util.Scanner;

public class NumberGuessingGame {

    private static int getGuess() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert a number: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);   // get random number between 0-100
        boolean find = false;
        boolean interval = false;
        int guess, counter = 0;
        int[] guesses = new int[5];

        System.out.println("Welcome to number guessing game!");
        System.out.println("You are going to guess the integer between 0-100");

        while (counter < 5) {
            guess = getGuess();

            if (guess < 0 || guess > 99) {
                if (interval) {
                    guesses[counter++] = guess;
                    if (counter == 5) {
                        continue;
                    }
                    System.out.println("Please insert a value between 0-100.");
                    System.out.println("Out of range, attempt remaining: " + (5 - counter));
                } else {
                    interval = true;
                    System.out.println("Out of range, next time you'll lose an attempt");
                }
                continue;
            }

            if (guess == number) {
                System.out.println("Congratulations, you have guessed: " + number + " on " + ++counter + ". attempt");
                find = true;
                break;
            } else {
                guesses[counter++] = guess;
                if (counter == 5) {
                    continue;
                }
                System.out.println("Incorrect guess !");
                if (guess > number) {
                    System.out.println(guess + " > random number, go lower!");
                } else {
                    System.out.println(guess + " < random number, go higher!");
                }

                System.out.println("Attempts remaining: " + (5 - counter));
            }
        }

        if (!find) {
            System.out.println("You have failed !");
            System.out.println("Your guesses : " + Arrays.toString(guesses));
            System.out.println("Number was : " + number);
        }

    }
}