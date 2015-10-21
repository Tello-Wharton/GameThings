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
        Graphics2D g2d = (Graphics2D) g;//.create();
        g2d.drawImage(body, at(), board);
        //g.dispose();
    }

    private int a = 0;
    private AffineTransform at(){
        at = new AffineTransform();
        at.translate(player.centerX() - 5, player.centerY() - 80);
        at.rotate(radians, 5, 80);
        a+=1;
        return at;
    }

}
