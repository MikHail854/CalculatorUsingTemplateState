import Calculator.Context;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {
        JFrame jFrame = getJFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        jPanel.setLayout(new GridLayout(4,4));

        JButton jButton1 = new JButton("C");
        JButton jButton2 = new JButton("1");
        JButton jButton3 = new JButton("2");
        JButton jButton4 = new JButton("3");
        JButton jButton5 = new JButton("4");
        JButton jButton6 = new JButton("5");
        JButton jButton7 = new JButton("6");
        JButton jButton8 = new JButton("7");
        JButton jButton9 = new JButton("8");
        JButton jButton10 = new JButton("9");
        JButton jButton11 = new JButton("0");
        JButton jButton12 = new JButton("+");
        JButton jButton13 = new JButton("-");
        JButton jButton14 = new JButton("*");
        JButton jButton15 = new JButton("/");
        JButton jButton16 = new JButton("=");


        jButton1.setPreferredSize(new Dimension(50,50));
        jButton2.setPreferredSize(new Dimension(50,50));
        jButton3.setPreferredSize(new Dimension(50,50));
        jButton4.setPreferredSize(new Dimension(50,50));
        jButton5.setPreferredSize(new Dimension(50,50));
        jButton6.setPreferredSize(new Dimension(50,50));
        jButton7.setPreferredSize(new Dimension(50,50));
        jButton8.setPreferredSize(new Dimension(50,50));
        jButton9.setPreferredSize(new Dimension(50,50));
        jButton10.setPreferredSize(new Dimension(50,50));
        jButton11.setPreferredSize(new Dimension(50,50));
        jButton12.setPreferredSize(new Dimension(50,50));
        jButton13.setPreferredSize(new Dimension(50,50));
        jButton14.setPreferredSize(new Dimension(50,50));
        jButton15.setPreferredSize(new Dimension(50,50));
        jButton16.setPreferredSize(new Dimension(50,50));

        //jPanel.add(new JButton("Hello"), BorderLayout.NORTH);
        //jButton1.setLocation(150,150);
        //jPanel.add(jButton1, BorderLayout.CENTER);
        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);
        jPanel.add(jButton6);
        jPanel.add(jButton7);
        jPanel.add(jButton8);
        jPanel.add(jButton9);
        jPanel.add(jButton10);
        jPanel.add(jButton11);
        jPanel.add(jButton12);
        jPanel.add(jButton13);
        jPanel.add(jButton14);
        jPanel.add(jButton15);
        jPanel.add(jButton16);
        jButton1.setLayout(new BorderLayout());

        System.out.println("Welcome to integer Calculator!");
        Context calc = new Context();
        while (true) {
            char key = (char) System.in.read();
            if (key >= ' ') {
                calc.press(key);
                System.out.println(calc);
            }
        }
    }

    static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 500,500);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        return jFrame;
    }


}
