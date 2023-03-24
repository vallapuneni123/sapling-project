import java.awt.*;
import java.awt.event.KeyEvent;

public class Peddle extends Rectangle {
    int id;
    int yVelocity;
    Peddle(int x,int y,int PEDDLE_WIDTH,int PEDDLE_HEIGHT,int id)
    {
        super(x,y,PEDDLE_WIDTH,PEDDLE_HEIGHT);
        this.id = id;
    }
    public void draw(Graphics g){
        if(id == 1) {
            g.setColor(Color.RED);
        }
        if(id==2) {
            g.setColor(Color.yellow);
        }
        g.fillRect(x,y,width,height);
    }
    public void move() {
        y+=yVelocity;
    }

    public void keyReleased(KeyEvent e){
        switch (id){
            case 1: if(e.getKeyCode()==KeyEvent.VK_UP){
                yVelocity=0;
            }
                if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                    yVelocity =0;
                }
                break;
            case 2: if(e.getKeyCode()==KeyEvent.VK_LEFT){
                yVelocity=0;
            }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    yVelocity=0;
                }
        }

    }
    public void keyPressed(KeyEvent e){
        switch (id){
            case 1: if(e.getKeyCode()==KeyEvent.VK_UP){
            yVelocity=-2;
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN) {
            yVelocity = 2;
        }
        break;
            case 2: if(e.getKeyCode()==KeyEvent.VK_LEFT){
                yVelocity=2;
            }
            if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                yVelocity=-2;
            }
        }
    }
}
