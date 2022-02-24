import acm.graphics.GCompound;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class GMan extends GCompound {

    //declares all parts of the man
    public GOval head = new GOval(50, 50);
    public GLine body = new GLine(head.getX()+ head.getWidth()/2, head.getY() + head.getHeight(), head.getX() + head.getWidth()/2, head.getY() + head.getHeight() + 75);
    public GLine arm1 = new GLine(body.getX(), body.getY() + body.getHeight()/2, (body.getX())+25, (body.getY() +body.getHeight()/2) -25);
    public GLine arm2 = new GLine(body.getX(), body.getY() + body.getHeight()/2, body.getX()-25, (body.getY() + body.getHeight()/2) -25);
    public GLine leg1 = new GLine(body.getX(), body.getY() + body.getHeight(), body.getX()-25, body.getY() + body.getHeight() +25);
    public GLine leg2 = new GLine(body.getX(), body.getY() + body.getHeight(), body.getX()+25, body.getY()+ body.getHeight() +25);

    //declares the stand
    public GRect btm = new GRect(150, 15);
    public GRect pole = new GRect(10, 225);
    public GRect top = new GRect(head.getWidth()/2 +( (head.getX()+ head.getWidth()/2) - (pole.getX()- pole.getWidth()*2))+10 , 10 );
    public GLine rope;

    //adds the man
    public void addMan(){

        add(head, 0, 0);
        add(body);
        add(arm1);
        add(arm2);
        add(leg1);
        add(leg2);
        
    }

    public void addStand(){
        add(btm, head.getX() + head.getWidth()/2 - btm.getWidth()/2, leg1.getY() + 50);
        btm.setFillColor(Color.GRAY);
        btm.setFilled(true);
        add(pole, btm.getX() + btm.getWidth()-5 - pole.getWidth(), btm.getY() - pole.getHeight());
        pole.setFillColor(Color.GRAY);
        pole.setFilled(true);
        add(top, head.getX() + head.getWidth()/2 -10, pole.getY() - top.getHeight());
        top.setFillColor(Color.GRAY);
        top.setFilled(true);
        rope = new GLine(body.getX(), pole.getY(), body.getX(), head.getY());
        add(rope);
    }

}
