import acm.program.GraphicsProgram;

public class Hangman extends GraphicsProgram {

    GMan stickman = new GMan();

    @Override
    public void init (){
        stickman.addMan();
        stickman.addStand();
        add(stickman, getWidth() - stickman.getWidth(), getHeight() - stickman.getHeight());

    }

    public static void main(String[] args) {
        new Hangman().start();
    }

}
