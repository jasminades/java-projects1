package WordOccurrencesCounter;

import java.util.Scanner;

public class OccurrenceCounting {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your paragraph: ");

        String content = reader.nextLine();

        Content myContent = new Content(content);

        System.out.println("Which word occurrence do you want to find? ");
        String word = reader.nextLine();
        System.out.println(word + ": " + myContent.getCount(word));

    }
}
