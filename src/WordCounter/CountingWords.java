package WordCounter;

import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Type your paragraph: ");

        String userInput = reader.nextLine();

        userInput = userInput.trim();

        int counter=0;

        if(userInput.length() == 0){
            counter=0;
            System.out.println("Invalid input.");
        }else{
            counter++;
            for(int i=0 ; i < userInput.length() ; i++){
                if(userInput.charAt(i) == ' ' && userInput.charAt(i+1) != ' '){
                    counter++;
                }
            }
        }
        System.out.println("Word count: " + counter);


    }
}
