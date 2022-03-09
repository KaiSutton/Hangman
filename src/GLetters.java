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
    public GLabel[] letters = {new GLabel (word.charAt(1) + " "), new GLabel(word.charAt(2)  + " "), new GLabel(word.charAt(3)  + " "), new GLabel(word.charAt(4)  + " "), new GLabel(word.charAt(5)  + " "), new GLabel(word.charAt(6)  + " ")};

    public void setWord(){
        word = words.words[rand];
    }

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
        setWord();
        for (int i = 0; i < 6; i++) {
            add(letters[i], lines[i].getX() + lines[i].getWidth()/2, lines[i].getY() +5);
        }
    }

}
