import java.awt.*;

/**
 * Created by Aaron on 20/10/2015.
 */
public class Body extends BasicEntity {
    Image body;
    private static Player player;


    public Body(String image, Player p){
        super(image);
        player = p;
        body = super.body;
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(body,player.xPos(),player.yPos(),board);
    }

}
