import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

import java.awt.*;

public class GLetters extends GCompound {

    public Word words = new Word();

    public GLabel[] gAlphabet = new GLabel[26];
    public int numLetters = 6;
    public GRect[] lines = new GRect[6];

    int rand = RandomGenerator.getInstance().nextInt(0, words.words.length);
    public String word;
    public GLabel[] letters = new GLabel[6];


    public void addLines(){
        for (int i = 0; i < 6; i++) {
            lines[i] = (new GRect(25, 1));
            add(lines[i],i*30, 50);
            lines[i].setFilled(true);
            lines[i].setFillColor(Color.BLACK);
        }
    }

    public void addAlphabet(){
        words.setWords();
        words.setAlphabet();
        for (int i = 0; i < 26; i++) {
            gAlphabet[i] = new GLabel(""+ words.alphabet[i]);
            add(gAlphabet[i],  i*20 -gAlphabet[i].getWidth()/2, 100);
        }
    }

    public void addLetters(){
        word = words.words[rand];

        for (int i = 0; i < 6; i++) {
            letters[i] = new GLabel (word.charAt(i) + " ");
        }

        for (int i = 0; i < 6; i++) {
            add(letters[i], lines[i].getX() + lines[i].getWidth()/2 -letters[i].getWidth()/2, lines[i].getY() +(-5));
            letters[i].setVisible(false);
        }
    }

    public void setLettersUsed(){
        for (int i = 0; i < 26; i++) {
            words.lettersUsed[i] = true;
        }
    }

    public void setLetterVisibility(int w){
        letters[w].setVisible(true);
    }
}
