package ro.jademy.millionaire;



import java.util.ArrayList;
import java.util.List;

public class Millionaire {

    public static void main(String[] args) {

        Game game = new Game();
        showStartMessage();

        game.askQuestion();


    }

    private static void showStartMessage() {
        System.out.println();
        System.out.println("**************************************************");
        System.out.println("**  Let's start WHO WANTS TO BE A MILLIONAIRE!  **");
        System.out.println("**************************************************");
        System.out.println();

    }








}

