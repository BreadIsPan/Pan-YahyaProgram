import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form1 extends JFrame{
    private JButton button1;
    private JLabel label1;
    private JPanel Main;

    public Form1() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label1.setText("HelloWorld");
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Main);
        pack();
        setVisible(true);
    }
}
