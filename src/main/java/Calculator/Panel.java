package Calculator;

import Calculator.Context;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {

    private JButton[] numbers = new JButton[10];
    private JButton[] action = new JButton[4];
    public JTextField output = new JTextField();
    private int helperX = 10;
    private int helperY = 70;

    public Panel() {
        setLayout(null);

        JButton jButtonClear = new JButton("C");
        JButton jButtonEqually = new JButton("=");

        jButtonClear.setBounds(10, 250, 50, 50);
        jButtonEqually.setBounds(130, 250, 50, 50);
        add(jButtonClear);
        add(jButtonEqually);

        /**
         * создание и добавление арифметических операций
         */
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                action[i] = new JButton("+");
                action[i].setBounds(190, 70, 50, 50);
            }
            if (i == 1) {
                action[i] = new JButton("-");
                action[i].setBounds(190, 130, 50, 50);
            }
            if (i == 2) {
                action[i] = new JButton("*");
                action[i].setBounds(190, 190, 50, 50);
            }
            if (i == 3) {
                action[i] = new JButton("/");
                action[i].setBounds(190, 250, 50, 50);
            }
            add(action[i]);
        }

        /**
         * Создание и добавление кнопок/цифр от 0 до 9
         */
        for (int i = 0; i < 10; i++) {
            numbers[i] = new JButton(i + "");
            if (i == 0) {
                numbers[i].setBounds(70, 250, 50, 50);
            } else {
                if (i <= 3 && i != 1) {
                    helperX += 60;
                    helperY = 70;
                }
                if (i >= 4 && i <= 6) {
                    if (i == 4) {
                        helperX = 10;
                        helperY = 130;
                    } else helperX += 60;
                }
                if (i >= 7 && i <= 9) {
                    if (i == 7) {
                        helperX = 10;
                        helperY = 190;
                    } else helperX += 60;
                }
                numbers[i].setBounds(helperX, helperY, 50, 50);
            }
            add(numbers[i]);
        }

        output.setBounds(10, 10, 230, 50);
        output.setEditable(false);
        add(output);
    //}

    //public void listenerButton() {
        final Context calc = new Context();

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                output.setText(output.getText() + b.getText());
                calc.press(output.getFocusAccelerator());
            }
        };
        for (JButton b : numbers) {
            b.addActionListener(listener);
        }
    }
}
