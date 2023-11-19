package MultipleChoiceTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<Question> questionSet;

    public Game(){
        questionSet = new ArrayList<Question>();
        String q;
        String[] a;

        q = "Where does the Sun rise?";
        a = new String[]{"East" , "South" , "West", "North"};
        questionSet.add(new Question(q,a,"East"));

        q = "Who invented the telephone?";
        a = new String[] {"Thomas Edison" , "Michael Faraday" , "James Watt", "Alexander Bell"};
        questionSet.add(new Question(q,a,"Alexander Bell"));

        q = "What is the capital of Japan?";
        a = new String[] {"Beijing" , "Tokyo" , "Seoul", "Bangkok"};
        questionSet.add(new Question(q,a,"Tokyo"));


        q = "What is the largest planet in our solar system?";
        a = new String[]{"Mercury", "Venus", "Earth", "Jupiter"};
        questionSet.add(new Question(q, a, "Jupiter"));


        q = "Who wrote 'Romeo and Juliet'?";
        a = new String[]{"Charles Dickens", "Jane Austen", "William Shakespeare", "Mark Twain"};
        questionSet.add(new Question(q, a, "William Shakespeare"));


        q = "Which element has the chemical symbol 'O' ?";
        a = new String[]{"Oxygen", "Osmium", "Omnium", "Oreganum"};
        questionSet.add(new Question(q, a, "Oxygen"));


        q = "In which year did the Titanic sink?";
        a = new String[]{"1905", "1912", "1920", "1931"};
        questionSet.add(new Question(q, a, "1912"));


        q = "What is the capital of Australia?";
        a = new String[]{"Sydney", "Melbourne", "Canberra", "Brisbane"};
        questionSet.add(new Question(q, a, "Canberra"));


        q = "Which planet is known as the 'Red Planet'?";
        a = new String[]{"Mars", "Venus", "Jupiter", "Saturn"};
        questionSet.add(new Question(q, a, "Mars"));


        q = "Who painted the Mona Lisa?";
        a = new String[]{"Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Claude Monet"};
        questionSet.add(new Question(q, a, "Leonardo da Vinci"));


        q = "What is the currency of Japan?";
        a = new String[]{"Yuan", "Won", "Yen", "Ringgit"};
        questionSet.add(new Question(q, a, "Yen"));


        q = "Which programming language is often used for Android app development?";
        a = new String[]{"Java", "C++", "Python", "Swift"};
        questionSet.add(new Question(q, a, "Java"));



        Collections.shuffle(questionSet, new Random());
    }

    public void start() {
        Scanner reader = new Scanner(System.in);

        int numCorrect = 0;
        for (int question = 0; question < questionSet.size(); question++) {
            System.out.println(questionSet.get(question).getQuestion());

            int numChoices = questionSet.get(question).getChoices().size();

            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice + 1) + ": " + questionSet.get(question).getChoices().get(choice));
            }

            int playerAnswer = reader.nextInt();
            ArrayList<String> choiceSet = questionSet.get(question).getChoices();
            String correctAnswer = questionSet.get(question).getAnswer();

            int corAnswer = choiceSet.indexOf(correctAnswer);
            if (playerAnswer == corAnswer + 1) {
                numCorrect++;
            }


        }
        reader.close();
        System.out.println("You got " + numCorrect + " correct answer(s)");

    }
}
