import acm.program.GraphicsProgram;
import svu.csc213.Dialog;
import acm.util.RandomGenerator;
import java.awt.*;

public class Hangman extends GraphicsProgram {

    GMan stickman = new GMan();
    GLetters letters = new GLetters();

    public int lives = 6;

    @Override
    public void init (){
        letters.words.setLettersUsed();
        letters.addLines();
        stickman.addMan();
        stickman.addStand();
        letters.addAlphabet();
        letters.addLetters();
        add(stickman, getWidth() - stickman.getWidth(), getHeight() - stickman.getHeight());
        add(letters, getWidth()/2 - letters.getWidth()/2, 0+letters.getHeight());
        stickman.setManVis(false);



    }

    public void guess(){

        String pGuess = Dialog.getString("Enter a 1 letter guess");
        if(pGuess.length() != 1){
            Dialog.showMessage("that wasn't a single letter, try again");
            pGuess = Dialog.getString("Enter a 1 letter guess");
        }

        if(letters.word.contains(pGuess)){

        }

    }





    public static void main(String[] args) {
        new Hangman().start();
    }

}
