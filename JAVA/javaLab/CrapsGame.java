/*
A popular game of chance is a die game know as craps, which is played in casinos and back alley
throught the world .the rules of the game are straightforward: You roll two dice. Each die has six
faces, which contain one,two,three,four,five and six spots, respectively .after the dice have come to
rest ,the sum of the spots on the two upward faces is calculated .

if the sum is 7 or 11 on the first throw ,you win .
if the sum is 2,3 or 12 on the first throw(called "Craps"),you lose (i.e. the
"house" wins). 
If the sum is 4,5,6,8,9,10 on the first throw, that sum becomes your "points" To
win, you must continue rolling the die until you “make your point” (i.e. roll that same pointvalue).
you lose by rolling a 7 before making your point.

Hint use ENUM,switch case.
*/

import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    
    // Enum to represent game outcomes
    enum Outcome {
        WIN, LOSE, POINT
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Craps Game!!");
        
        // First roll
        int sum = rollDice(random);
        System.out.println("You rolled: " + sum);
        
        Outcome outcome = determineOutcome(sum);
        
        switch (outcome) {
            case WIN:
                System.out.println("You win!");
                break;
            case LOSE:
                System.out.println("You lose! (Craps)");
                break;
            case POINT:
                int point = sum;
                System.out.println("Your point is: " + point);
                // Continue rolling until point is made or 7 is rolled
                while (true) {
                    sum = rollDice(random);
                    System.out.println("You rolled: " + sum);
                    
                    if (sum == point) {
                        System.out.println("You made your point! You win!");
                        break;
                    } else if (sum == 7) {
                        System.out.println("You rolled a 7. You lose!");
                        break;
                    }
                }
                break;
        }
        
        scanner.close();
    }

    // Method to roll two dice and return the sum
    private static int rollDice(Random random) {
        int die1 = random.nextInt(6) + 1; // Die 1: 1-6
        int die2 = random.nextInt(6) + 1; // Die 2: 1-6
        return die1 + die2; // Return the sum of both dice
    }

    // Method to determine the outcome of the first roll
    private static Outcome determineOutcome(int sum) {
        switch (sum) {
            case 7:
            case 11:
                return Outcome.WIN;
            case 2:
            case 3:
            case 12:
                return Outcome.LOSE;
            default:
                return Outcome.POINT; // All other sums become the point
        }
    }
}