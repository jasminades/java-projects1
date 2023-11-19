package ForwardTime;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter current hour: ");
        int currentHour = reader.nextInt();

        System.out.println("Enter current minute: ");
        int currentMinute = reader.nextInt();

        System.out.println("Enter current second: ");
        int currentSecond= reader.nextInt();

        System.out.println("The time you wrote is: " + currentHour + "h " + currentMinute + "min " + currentSecond + "s ");

        //going forward:

        System.out.println("Enter hour to go forward: ");
        int forwardHour = reader.nextInt();

        System.out.println("Enter minute to go forward: ");
        int forwardMinute = reader.nextInt();

        System.out.println("Enter second to go forward: ");
        int forwardSecond= reader.nextInt();

        int answerHour=0, answerMinute=0, answerSecond=0;
        int carrySecond=0, carryMinute=0;
        boolean isNextDay = false;

        answerSecond = currentSecond + forwardSecond;
        if(answerSecond >= 60){
            answerSecond -= 60;
            carrySecond = 1;
        }

        answerMinute = currentMinute + forwardMinute + carrySecond;
        if(answerMinute >= 60){
            answerMinute -= 60;
            carryMinute = 1;
        }

        answerHour = currentHour + forwardHour + carryMinute;
        if(answerHour >= 24){
            answerHour -= 24;
            isNextDay = true;
        }

        if(isNextDay) {
            System.out.println("The answer is: " + answerHour + "h " + answerMinute + "min " + answerSecond + "s  on the next day!");
        }
        else{
            System.out.println("The answer is: " + answerHour + "h " + answerMinute + "min " + answerSecond + "s " );
        }




    }

}
