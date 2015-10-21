import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Aaron on 20/10/2015.
 */
public class Arm extends Entity {

    private BufferedImage body;
    //private AffineTransform at;

    private double b;

    private static Player player;
    private static double bStart = 0;

    private int xPos;
    private int yPos;

    private double rotationConstant = 0.1;

    public Arm(String image, Player p) {
        super(image);
        player = p;

        //at = new AffineTransform();
        //at.translate(player.centerX(), player.centerY() - 80);

        try {
            body = ImageIO.read(new File(image));
        }catch (IOException e) {

        }
        b = bStart;


        bStart += Math.toRadians(36);




    }


    @Override
    public void update() {

        //at.rotate(0.01, 0, 80);


        //at.rotate(0.1);




    }
    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;//.create();
        g2d.drawImage(body, at(), board);
        //g.dispose();

    }

    private int a = 0;
    private AffineTransform at(){
        AffineTransform at = new AffineTransform();
        at.translate(player.centerX(), player.centerY() - 80);
        at.rotate(b + 0.01 * a, 0, 80);
        a+=1;
        return at;
    }

}
