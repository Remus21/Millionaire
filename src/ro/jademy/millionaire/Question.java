package ro.jademy.millionaire;

import java.util.ArrayList;
import java.util.List;

public class Question {

    public static final int MAX_LEVEL = 15;

    private String question;
    private int difficultyLevel; // max 15
    private List<Answer> answerList = new ArrayList<>();

    public Question(String question, int difficultyLevel, List<Answer> answers){

        this.question = question;
        this.difficultyLevel = difficultyLevel;
        this.answerList.addAll(answers);
    }

    public int getDifficultyLevel(){
        return difficultyLevel;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }



    public String getQuestion(){
        return question;
    }

    public Answer getCorrectAnswer() {
        for (Answer answer: answerList){
            if(answer.getIsCorrect()){
                return answer;
            }
        }
        return null;
    }
}
