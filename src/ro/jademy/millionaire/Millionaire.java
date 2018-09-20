package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Millionaire {



    public static void main(String[] args) {

        Game game = new Game();

        showStartMessage();

        ArrayList<Question> questions = new ArrayList<>();
        List<Answer> answers = new ArrayList<>();

        Answer answer1Question1 = new Answer("Fotball", false);
        Answer answer2Question1 = new Answer("Who wants to be a millionaire", true);
        Answer answer3Question1 = new Answer("Winning Lines", false);
        Answer answer4Question1 = new Answer("Duel", false);

        answers.add(answer1Question1);
        answers.add(answer2Question1);
        answers.add(answer3Question1);
        answers.add(answer4Question1);

        Question question1 = new Question("Cum se numeste jocul?", 1,answers);
        questions.add(question1);


    }

    private static void showStartMessage() {
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("**  Let's start WHO WANTS TO BE A MILLIONAIRE!  **");
        System.out.println("**************************************************");
        System.out.println();

    }








}

