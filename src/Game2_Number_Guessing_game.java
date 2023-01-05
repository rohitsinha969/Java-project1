
/**
 * Game2_Number_Guessing_game
 */
import java.util.*;

class Game {
    public int number;
    public int inputNumber;
    public int userGuess = 0;

    public int getuserGuess() {
        return userGuess();
    }

    private int userGuess() {
        return 0;
    }

    public void setuserGuess(int userGuess) {
        this.userGuess = userGuess;
    }

    Game() {//constructor
        Random mathRandom = new Random();
        this.number = mathRandom.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess a number ranging from 0 to 100");
        Scanner scan = new Scanner(System.in);
        inputNumber = scan.nextInt();
    }

    boolean isCorrect() {
        userGuess++;
        System.out.println("attempts made = " + userGuess);
        if (inputNumber == number) {
            System.out.println("You finally took " + userGuess + " guesses in total to guess the number");
            if (userGuess <= 1) {
                System.out.println("Total point scored = " + 100);
            } else if (userGuess <= 3) {
                System.out.println("Total point scored = " + 75);
            } else if (userGuess <= 5) {
                System.out.println("Total point scored = " + 50);
            } else if (userGuess <= 10) {
                System.out.println("Total point scored = " + 25);
            } else if (userGuess > 10) {
                System.out.println("Total point scored = " + 10);
            } else if (userGuess > 15) {
                System.out.println("Total point scored = " + 5);
            }
            return true;
        } else if (inputNumber < number) {
            System.out.println("You guessed a lesser number, plz try again");
        } else if (inputNumber > number) {
            System.out.println("You guessed a greater number, plz try again");
        }
        return false;

    }
}

public class Game2_Number_Guessing_game {

    public static void main(String[] args) {
        Game gg = new Game();
        boolean b = false;
        while (!b) {
            gg.takeUserInput();
            b = gg.isCorrect();
        }
    }
}