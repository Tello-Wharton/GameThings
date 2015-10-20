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
    AffineTransform at;

    public Arm(String image) {
        super(image);
        try {
            body = ImageIO.read(new File(image));
        }catch (IOException e) {

        }

        at = new AffineTransform();
    }

    @Override
    public void update() {
        at.rotate(0.1);
    }
    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(body, at, null);
    }
}
