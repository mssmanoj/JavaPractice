package basic.problems.functional_programming.lambda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow {
    public static void main(String[] args) {
        //window - object of jFrame

        JFrame frame1 = new JFrame("AnonymousWindow");
        frame1.setSize(400,400);
        frame1.setLayout(new FlowLayout());
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setVisible(true);

        Button button1 = new Button("Click Here");
        button1.setSize(10,10);
        frame1.add(button1);

        //using ActionListener by anonymous class
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane pane = new JOptionPane();
                JOptionPane.showMessageDialog(null,"Clicked from anonymous");
                //System.out.println("Button clicked");
            }
        });

        JFrame frame2 = new JFrame("LambdaWindow");
        frame2.setSize(400,400);
        frame2.setLayout(new FlowLayout());
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setVisible(true);

        Button button2 = new Button("Click Here");
        button2.setSize(10,10);
        frame2.add(button2);
        //using ActionListener by lambda
        ActionListener actionListener = (e)->{
            JOptionPane.showMessageDialog(null,"Clicked from lambda");
        };
        button2.addActionListener(actionListener);
    }
}
