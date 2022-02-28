import acm.graphics.GCompound;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class GLetters extends GCompound {

    Word words = new Word();
    public GLabel[] gAlphabet = new GLabel[26];
    public int numLetters = 6;
    public GRect[] lines = new GRect[6];

    public void addLines(){
        for (int i = 0; i < 6; i++) {
            lines[i] = (new GRect(25, 2));
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

}
