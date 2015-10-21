import javax.swing.*;
import java.awt.*;

/**
 * Created by Aaron on 20/10/2015.
 */
public abstract class Entity {
    public static Board board;
    protected Image body;

    protected int xPos;
    protected int yPos;

    protected int width;
    protected int height;

    public Entity(String image){
        ImageIcon ii = new ImageIcon(image);
        body = ii.getImage();

        width = ii.getIconWidth();
        height = ii.getIconHeight();

    }


    public abstract void update();
    public abstract void draw(Graphics g);

}
