

public class Word {

    public String[] words = new String[20];
    public char[] alphabet = new char[26];
    public boolean[] lettersUsed = new boolean[26];



    public void setWords(){
        words[0] = "branch";
        words[1] = "camera";
        words[2] = "circle";
        words[3] = "danger";
        words[4] = "empire";
        words[5] = "engine";
        words[6] = "friend";
        words[7] = "health";
        words[8] = "island";
        words[9] = "letter";
        words[10] = "luxury";
        words[11] = "marine";
        words[12] = "nobody";
        words[13] = "planet";
        words[14] = "random";
        words[15] = "senior";
        words[16] = "talent";
        words[17] = "yellow";
        words[18] = "wonder";
        words[19] = "valley";

    }

    public void setAlphabet(){
        alphabet[0] = 'a';
        alphabet[1] = 'b';
        alphabet[2] = 'c';
        alphabet[3] = 'd';
        alphabet[4] = 'e';
        alphabet[5] = 'f';
        alphabet[6] = 'g';
        alphabet[7] = 'h';
        alphabet[8] = 'i';
        alphabet[9] = 'j';
        alphabet[10] = 'k';
        alphabet[11] = 'l';
        alphabet[12] = 'm';
        alphabet[13] = 'n';
        alphabet[14] = 'o';
        alphabet[15] = 'p';
        alphabet[16] = 'q';
        alphabet[17] = 'r';
        alphabet[18] = 's';
        alphabet[19] = 't';
        alphabet[20] = 'u';
        alphabet[21] = 'v';
        alphabet[22] = 'w';
        alphabet[23] = 'x';
        alphabet[24] = 'y';
        alphabet[25] = 'z';

    }

    public void setLettersUsed(){
        for (int i = 0; i < 26; i++) {
            lettersUsed[i] = true;
        }
    }

}
