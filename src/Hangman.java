import acm.program.GraphicsProgram;
import svu.csc213.Dialog;
import acm.util.RandomGenerator;
import java.awt.*;

public class Hangman extends GraphicsProgram {

    GMan stickman = new GMan();
    GLetters letters = new GLetters();

    public int correctGuesses = 0;

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

        System.out.println(letters.word);

        gameLoop();

    }

    private void gameLoop(){
        while (0 == 0){
            if (correctGuesses != 6 && lives > 0){
                guess();
            }else if (lives <= 0){
                Dialog.showMessage("You failed you idiot");
                System.exit(0);
            } else if (correctGuesses == 6){
                Dialog.showMessage("You beat the game good job");
                System.exit(0);
            }
        }
    }

    public void guess(){

        String pGuess = Dialog.getString("Enter a 1 letter guess");
        if(pGuess.length() != 1){
            Dialog.showMessage("that wasn't a single letter, try again");
            pGuess = Dialog.getString("Enter a 1 letter guess");
        }

        if(letters.word.contains(pGuess)){
            correctGuess(pGuess.charAt(0));
        }else{
            bakaGuess();
        }
    }

    private void bakaGuess() {
        lives -= 1;
        gameLoop();
    }

    private void correctGuess(char a) {
        //tells where the letter is
        boolean found = false;
        int where = 0;
        while (found = false){
            if (letters.word.charAt(where) == a){
                letters.letters[where].setVisible(true);
                correctGuesses += 1;
                found = true;
            }else {
                where += 1;
            }
        }

    }


    public static void main(String[] args) {
        new Hangman().start();
    }

}
