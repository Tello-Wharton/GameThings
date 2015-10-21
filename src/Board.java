import javafx.scene.input.KeyCode;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javafx.scene.input.KeyCode.W;

/**
 * Created by Aaron on 20/10/2015.
 */
public class Board extends JPanel implements ActionListener {

    private static final int DELAY = 25;

    private Timer timer;

    private Player player;





    public Board() {
        addKeyListener(new TAdapter());
        addMouseMotionListener(new MAdapter());

        setBackground(Color.black);
        setFocusable(true);
        setDoubleBuffered(true);

        loadItems();
        initGame();

        Entity.board = this;

    }

    private void loadItems() {
        player = new Player();
    }

    public void initGame(){
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }

    private void doDrawing(Graphics g) {

        player.draw(g);

        Toolkit.getDefaultToolkit().sync();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        player.update();

        repaint();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if(key == KeyEvent.VK_W) player.moveUp();
            if(key == KeyEvent.VK_A) player.moveLeft();
            if(key == KeyEvent.VK_S) player.moveDown();
            if(key == KeyEvent.VK_D) player.moveRight();

        }

        @Override
        public void keyReleased(KeyEvent e){
            int key = e.getKeyCode();

            if(key == KeyEvent.VK_W) player.stopUp();
            if(key == KeyEvent.VK_A) player.stopLeft();
            if(key == KeyEvent.VK_S) player.stopDown();
            if(key == KeyEvent.VK_D) player.stopRight();
        }
    }

    private class MAdapter extends MouseAdapter{
        @Override
        public void mouseMoved(MouseEvent e){


        }

    }
}

