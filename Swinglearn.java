import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Swinglearn {
    public static void main(String[] args){

        JLabel label=new JLabel();
        label.setText("HI HOW ARE YOU");
        label.setFont(new Font("MV Boli",Font.BOLD,20));
        //label.setIcon

        JPanel panel=new JPanel();
        panel.setBackground(Color.BLUE);
        panel.setBounds(0,0,250,250);

        JButton button =new JButton();
        button.setText(("Hi"));
        button.setBounds(200,100,100,50);
        

        JFrame frame=new JFrame();
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setTitle("Jframe Trial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        //Default is HIDE_ON_CLOSE
        frame.setResizable(false);
        //frame.add(label);
        panel.add(label);
        frame.add(panel);

        /*ImageIcon image=new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());*/
        frame.getContentPane().setBackground(Color.BLACK);
    }
}
