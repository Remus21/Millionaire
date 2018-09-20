package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Game {

    public int currentLevel = 1;

    private ArrayList<Question> questions = new ArrayList<>();
    private List<Answer> answers = new ArrayList<>();

    public void start(){
        // initializam intrebarile si jocul

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

    public void askQuestion(){
        //show question on screen
    }

    public void answerQuestion(){
        // get user input and check if correct
    }

    public void fiftyFifty(){
        // show the same question but with only two possible answers
    }

    public void showScore(){
        System.out.println(currentLevel);
    }
}
