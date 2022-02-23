

public class Word {

    public String[] words = new String[1];
    public boolean[] lettersUsed = new boolean[26];

    public void setWords(){
        words[0] = "word";
    }

    public void setLettersUsed(boolean yaur, int x){
        lettersUsed[x+1] = yaur;
    }

    public boolean getLettersUsed(int x){
        return lettersUsed[x];
    }

    public String getWord(int x){
        return words[(x+1)];
    }

    public int getNumbersOfLetters(int x){
        return words[x+1].length();
    }

}
