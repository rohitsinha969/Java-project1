
/**
 * Game1_Rock_Paper_Scissor
 */
import java.util.*;

public class Game1_Rock_Paper_Scissor {

    public static void main(String[] args) {
        // 0 - Rock
        // 1 - Paper
        // 2 - Scissor
        Scanner scan = new Scanner(System.in);
        System.out.println(" 0-Rock \n 1-Paper \n 2-Scissor");
        System.out.println("Hey player select one number from the above numbers to play the game");
        int userInput = scan.nextInt();
        Random mathRandom = new Random();
        int computerInput = mathRandom.nextInt(3);
        if (computerInput == userInput) {
            System.out.println("It was tie");
        } else if (userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1
                || userInput == 0 && computerInput == 2) {
            System.out.println("Yipeee you won that ! dang it ! haha...");
        } else {
            System.out.println("You lost bro , let's play again");
        }

        System.out.println("computer input was : " + computerInput);
        scan.close();
    }
}