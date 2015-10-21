import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Aaron on 20/10/2015.
 */
public class Player{

    private boolean up;
    private boolean down;
    private boolean left;
    private boolean right;

    private Body body;
    private ArrayList<Arm> arms;

    private int xPos;
    private int yPos;
    private int width;
    private int height;

    public Player(){
        xPos = 100;
        yPos = 100;

        body = new Body("BlueBox.png", this);
        arms = new ArrayList<Arm>();
        width = body.width;
        height = body.height;
        for(int x = 0; x < 10; x++){
            arms.add(new Arm("Arm.png", this));
        }

    }


    public int centerX(){
        return (xPos + (width/2));
    }

    public int centerY(){
        return (yPos + (height/2));
    }

    public int xPos(){
        return xPos;
    }

    public int yPos(){
        return yPos;
    }

    public void update(){
        if(up)      yPos-=3;
        if(down)    yPos+=3;
        if(left)    xPos-=3;
        if(right)   xPos+=3;
        body.update();
        //arms.forEach(Arm::update);
    }

    public void draw(Graphics g){
        body.draw(g);

        for(Arm arm : arms){
            arm.draw(g);
        }


    }

    public void moveUp(){
            up = true;
            down = false;
    }

    public void moveDown(){
        up = false;
        down = true;
    }

    public void moveLeft() {
        left = true;
        right = false;
    }

    public void moveRight() {
        left = false;
        right = true;
    }

    public void stopUp() {
        up = false;
    }

    public void stopLeft() {
        left = false;
    }

    public void stopDown() {
        down = false;
    }

    public void stopRight() {
        right = false;

    }
}
