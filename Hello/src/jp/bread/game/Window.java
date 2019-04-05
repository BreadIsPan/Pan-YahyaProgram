package jp.bread.game;

import javax.swing.*;
import java.awt.*;

public class Window extends Canvas {
    private  static final long serialVersionUID = 3852387121044914558L;

    public Window(int width, int height,String title, Main game){
        JFrame frame = new JFrame(title);

        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();



    }

}
