package defoult;

import javax.swing.*;
import java.awt.*;
public class WisielecFrame extends JFrame {
    JFrame frame = new JFrame();
    JPanel topPanel = new JPanel();
    JPanel centralPanel = new JPanel();
    JPanel rightPanel = new JPanel();
    JLabel topLabel = new JLabel("GRA WISIELEC - ODGADNIJ SŁOWO");
    JLabel centralLabel1 = new JLabel("", SwingConstants.CENTER);
    JLabel centralLabel2 = new JLabel("", SwingConstants.CENTER);
    JLabel rightLabel = new JLabel();
    JTextField textField = new JTextField();
    JButton button = new JButton("OK");
    ImageIcon icon = new ImageIcon("Frida.jpg");
public WisielecFrame() {
    frame.setTitle("Gra Wisielec");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setBackground(Color.lightGray);
    setIconImage(icon.getImage());
    this.setIconImage(icon.getImage());
    frame.setIconImage(icon.getImage());

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
    centralPanel.setLayout(new GridLayout(4, 0));
    centralLabel1.setFont(new Font("Arial", Font.PLAIN, 20));
    centralLabel2.setFont(new Font("Arial", Font.BOLD, 30));
    textField.setBackground(Color.white);
    textField.setHorizontalAlignment(JLabel.CENTER);

    centralPanel.add(centralLabel1);
    centralPanel.add(centralLabel2);
    centralPanel.add(textField);
    centralPanel.add(button);
    //button.addActionListener(this);
    mainContainer.add(centralPanel);

    // Right Panel
    rightPanel.setBackground(Color.WHITE);
    rightPanel.setPreferredSize(new Dimension(190,0));
    rightPanel.setLayout(new BorderLayout());
    mainContainer.add(rightPanel, BorderLayout.EAST);

    frame.add(mainContainer);
    frame.setVisible(true);
    }
}