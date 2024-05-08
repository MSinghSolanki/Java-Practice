package Practice;

import java.util.Random;
import java.util.Scanner;

public class practiceexercise3 {

    // Gues the number game

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println(randomNumber);

        System.out.println("Lets Play Guess the number game");
        Scanner scan = new Scanner(System.in);

        int count = 0;
        while (true) {
            System.out.println("Please Enter a number between 1 and 100");
            int guess = scan.nextInt();

            if (randomNumber == guess) {

                System.out.println("Congratulations! You guessed the number correctly in " + count + " attempts.");
                break;

            } 
            else if (randomNumber > guess)
             {
                System.out.println("The number is greater than your guess.");
                count++;
            } 
            else
             {
                System.out.println("The number is less than your guess.");
                count++;
            }
        }
        scan.close();
    }

}
