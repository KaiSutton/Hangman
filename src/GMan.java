import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class GMan extends GraphicsProgram {

    public GOval head = new GOval(100, 100);
    public GLine body = new GLine(head.getX()+ head.getWidth()/2, head.getY() + head.getHeight(), head.getX() + head.getWidth()/2, head.getY() + head.getHeight() + 200);
    public GLine arm1 = new GLine(body.getX(), body.getHeight()/2, (body.getX())+50, (body.getY() +body.getHeight()/2) +50);
    public GLine arm2 = new GLine(body.getX(), body.getY() + body.getHeight()/2, body.getX()-50, (body.getY() + body.getHeight()/2) -50);
    public GLine leg1 = new GLine(body.getX(), body.getY() + body.getHeight(), body.getX()-50, body.getY() + body.getHeight() -50);
    public GLine leg2;

    public void addMan(){

        add(head, getWidth()/2 - head.getWidth()/2, getHeight()/2 - head.getHeight()/2);
        add(body);
        add(arm1);
        add(arm2);
        add(leg1);
        add(leg2);
        
    }
}
