import javax.swing.*;
import java.awt.*;

public class WisielecFrame extends JFrame {
    JFrame frame = new JFrame();
    JPanel topPanel = new JPanel();
    JPanel centralPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    JLabel topLabel = new JLabel("GRA WISIELEC - ODGADNIJ SŁOWO");
    JLabel centralLabel1 = new JLabel("Central Label", SwingConstants.CENTER);
    JLabel centralLabel2 = new JLabel("Central Label", SwingConstants.CENTER);

public WisielecFrame(){
    frame.setTitle("Wisielec");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setBackground(Color.lightGray);
    //frame.setLayout(new BorderLayout());

    Container mainContainer = this.getContentPane();
    mainContainer.setLayout(new BorderLayout(5,5));

    //Top Panel
    topLabel.setBackground(Color.lightGray);
    topLabel.setForeground(new Color(25, 160, 0));
    topLabel.setFont(new Font("Ink Free", Font.BOLD, 40));
    topLabel.setHorizontalAlignment(JLabel.CENTER);
    topLabel.setOpaque(true);
    topPanel.setPreferredSize(new Dimension(0,100));
    topPanel.setLayout(new BorderLayout());
    topPanel.add(topLabel);
    mainContainer.add(topPanel, BorderLayout.NORTH);

    // Central Panel
    centralPanel.setBackground(Color.cyan);
    centralPanel.setLayout(new GridLayout(5, 0));
    centralPanel.add(centralLabel1);
    centralPanel.add(centralLabel2);
    mainContainer.add(centralPanel);

    // Right Panel
    rightPanel.setBackground(Color.white);
    rightPanel.setPreferredSize(new Dimension(190,0));
    mainContainer.add(rightPanel, BorderLayout.EAST);

    frame.add(mainContainer);
    frame.setVisible(true);
    }
}
