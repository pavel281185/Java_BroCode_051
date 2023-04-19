import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JLabel label = new JLabel();
        ImageIcon image = new ImageIcon("logo.png");

        label.setIcon(image);
        label.setText("Pavel na drogách");
        label.setBounds(0,0,200,200);
//        label.setVerticalAlignment(JLabel.BOTTOM);
//        label.setHorizontalAlignment(JLabel.RIGHT);

        panel1.setBackground(Color.yellow);
        panel1.setBounds(0,0,400,400);
        panel1.setLayout(null);
        panel1.add(label);

        panel2.setBackground(Color.blue);
        panel2.setBounds(400,400,400,400);
        panel3.setLayout(null);

        panel3.setBackground(Color.red);
        panel3.setBounds(400,0,400,400);
        panel3.setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(800,800);
        frame.setVisible(true);
        frame.add(panel3);
        frame.add(panel1);
        frame.add(panel2);
    }
}