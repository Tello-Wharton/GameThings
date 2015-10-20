import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by Aaron on 20/10/2015.
 */
public class Board extends JPanel implements ActionListener {

    private static final int DELAY = 100;

    private Timer timer;


    public Board() {
        addKeyListener(new TAdapter());
        setBackground(Color.black);
        setFocusable(true);


        //loadImages();
        //initGame();


    }

    public void initGame(){
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    private class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

        }


    }
}

