package defoult;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WisielecWinFrame extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("GRATULACJE!!!");
    JButton button = new JButton("OK");

public WisielecWinFrame(){
    frame.setTitle("Gra Wisielec");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(400, 150);
    frame.setLocation(150, 300);

    label.setBackground(Color.GREEN);
    label.setFont(new Font("Ink Free", Font.BOLD, 20));
    label.setHorizontalAlignment(JLabel.CENTER);
    label.setOpaque(true);
    button.addActionListener(this);

    frame.add(label, BorderLayout.CENTER);
    frame.add(button, BorderLayout.SOUTH);
    frame.setVisible(true);
}

    @Override
    public void actionPerformed(ActionEvent e) {
    frame.setVisible(false);
    }

    static class Wisielce {
        public static Image wisielec1 = new ImageIcon("wisielec1.png").getImage();
        public static Image wisielec2 = new ImageIcon("wisielec2.png").getImage();
    }
}
