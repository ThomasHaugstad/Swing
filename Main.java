import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static javax.swing.SwingUtilities.paintComponent;

/*
public class drawpanel extends JPanel{

    private static int grid = 10;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);



    }

    Jframe frame = new JFrame("Team 7 Lab 3");
    JButton random = new JButton("Redraw");
    JPanel panel = new JPanel();
 */



public class Main {





    public static void main(String[] args) {



        System.out.println("Hello, World!");
        drawpanel d = new drawpanel();
        JFrame frame = new JFrame("Team 7 Lab 3");
        JButton redrawbutton = new JButton("Redraw");
        redrawbutton.setBounds(150,400,220,50);

        redrawbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


            }
        });
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("Team 7");
        frame.add(label1);
        frame.setSize(500,500);
        frame.add(redrawbutton);
        frame.add(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        if(!redrawbutton.isEnabled()){
            main(args);
        }





    }



}