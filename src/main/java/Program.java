import Calculator.Context;
import Calculator.Panel;

import javax.swing.*;
import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {
        JFrame jFrame = getJFrame();
        jFrame.add(new Panel());

        System.out.println("Welcome to integer Calculator!");
        Context calc = new Context();

        while (true) {
            char key = (char) System.in.read();
            if (key >= ' ') {
                //calc.press(key);
                System.out.println(calc);
            }
        }
    }

    static JFrame getJFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setBounds(750, 250, 265,347);
        //jFrame.setBounds(750, 250, 270,350);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        return jFrame;
    }


}
