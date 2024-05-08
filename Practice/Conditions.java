package Practice;

import java.util.Random;
import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {

        String[] strings = { "Rock", "Paper", "Scissors" };
        Random random = new Random();

        int userPoints = 0;
        int computerPoints = 0;
        int roundsPlayed = 0;

        System.out.println("RSP games");
        System.out.println("Enter your Choice to start the game ");

        Scanner choice = new Scanner(System.in);
        int i = 5;

        while (roundsPlayed < 6) {

            int randomIndex = random.nextInt(strings.length);
            String userchoice = choice.nextLine();

            if (userchoice.equalsIgnoreCase("quit")) {
                break;
            }

            if (!userchoice.equals("Rock") && !userchoice.equals("Paper") && !userchoice.equals("Scissors")) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                return;
            }
            System.out.println("Computer's choice: " + strings[randomIndex]);
            System.out.println("Your choice: " + userchoice);

            if (userchoice.equals(strings[randomIndex])) {
                System.out.println("It's a tie!");
            } else if ((userchoice.equals("Rock") && strings[randomIndex].equals("Scissors")) ||
                    (userchoice.equals("Paper") && strings[randomIndex].equals("Rock")) ||
                    (userchoice.equals("Scissors") && strings[randomIndex].equals("Paper"))) {
                System.out.println("You win!");
                userPoints++;
            } else {
                System.out.println("Computer wins!");
                computerPoints++;
            }
            // Print current score
            System.out.println("Your Points: " + userPoints);
            System.out.println("Computer's Points: " + computerPoints);
            roundsPlayed++;
        }
        System.out.println("Final Score:");
        System.out.println("Your Points: " + userPoints);
        System.out.println("Computer's Points: " + computerPoints);
        System.out.println("Thanks for playing!");
        if (computerPoints > userPoints) {
            System.out.println("Sorry Better Luck next time");
        } else {
            System.out.println("Congratulations You won");
        }
    }
}
