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
    private AffineTransform at;



    private static Player player;
    private static double bStart = 0;

    public Arm(String image, Player p) {
        super(image);
        player = p;

        try {
            body = ImageIO.read(new File(image));
        }catch (IOException e) {

        }
        radians = Math.toRadians(bStart);
        bStart += 36;
        grow = 1;
        a = 0;



    }



    @Override
    public void update() {
        radians += Player.ARM_SPEED;
        if(radians > Math.PI){
            radians -= Math.PI*2;
        }
    }

    private double radians;
    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(body, at(), board);
    }


    private int grow;
    private int a;
    private AffineTransform at(){
        at = new AffineTransform();
        at.translate(player.centerX() - 5, player.centerY() - (40 + a));
        at.rotate(radians, 5, 40 + a);
        a+=grow;
        if(a > 39)grow=-1;
        if(a < 0) grow= 1;
        return at;
    }

}
