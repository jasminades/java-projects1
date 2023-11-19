package GameOfDice;

import java.util.Scanner;
import java.util.Random;

public class Gaming {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        int numDice = 3, trials = 5;
        int playerPoints = 0, computerPoints = 0;

        Random choice = new Random();

        System.out.println("Choose your target number: ");
        int playerTarget = reader.nextInt();

        Game player=  new Game(numDice, trials);

        playerPoints = player.play("Player", playerTarget);

        int computerTarget = choice.nextInt(6) +1;

        System.out.println("Computer's target is " + computerTarget);


        Game computer = new Game(numDice, trials);
        computerPoints = computer.play("Computer", computerTarget);

        if(playerPoints > computerPoints){
            System.out.println("You win!");
        }
        else if(playerPoints < computerPoints){
            System.out.println("You lost!");
        }
        else{
            System.out.println("It's a draw game!");
        }
    }
}
