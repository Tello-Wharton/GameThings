import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Aaron on 26/10/2015.
 */
public class Bullet extends BasicEntity{

    private Scope scope;
    private BufferedImage body;
    private AffineTransform at;
    private double[] vector;

    public Bullet(Scope scope){
        this.scope = scope;
        vector = scope.vector();
        double modulus = Math.sqrt(vector[0]*vector[0] + vector[1]*vector[1]);
        vector[0]/= modulus;
        vector[1]/= modulus;

        try {
            body = ImageIO.read(new File("arm.png"));
        }catch (IOException e) {

        }
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {

    }
}
