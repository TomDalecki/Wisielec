import javax.swing.*;
import java.awt.*;

public class Wisielec {
    JFrame frame = new JFrame();
    JPanel textPanel = new JPanel();
    JPanel gamePanel = new JPanel();
    JPanel graphicsPanel = new JPanel();
public Wisielec (){
    frame.setTitle("Wisielec");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setBackground(Color.lightGray);
    frame.setLayout(new BorderLayout(5,5));

    textPanel.setBackground(Color.lightGray);
    gamePanel.setBackground(Color.cyan);
    graphicsPanel.setBackground(Color.white);

    textPanel.setPreferredSize(new Dimension(0,100));
    graphicsPanel.setPreferredSize(new Dimension(250,0));

    frame.add(textPanel, BorderLayout.NORTH);
    frame.add(gamePanel, BorderLayout.CENTER);
    frame.add(graphicsPanel, BorderLayout.EAST);

    frame.setVisible(true);

    }


}
