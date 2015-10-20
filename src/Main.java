import javax.swing.*;
import java.awt.EventQueue;


/**
 * Created by Aaron on 20/10/2015.
 */

public class Main extends JFrame {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main ex = new Main();
                ex.setVisible(true);
            }
        });
    }

    public Main() {

        initUI();
    }

    private void initUI() {
        add(new Board());

        setSize(1366, 768);

        setTitle("Game c:");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



}
