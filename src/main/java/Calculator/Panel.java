package Calculator;

import javax.swing.*;
import java.awt.event.*;

public class Panel extends JPanel {

    private JButton[] numbers = new JButton[10];
    private JButton[] action = new JButton[4];
    public JTextField output = new JTextField();
    private int helperX = 10;
    private int helperY = 70;

    public Panel() {

        setLayout(null); //позволяет размещать нужные элементы по любым координатам
        setFocusable(true);
        grabFocus();

        final Context calc = new Context(output);

        /**
         * Создание, добавление и "прослушивание" кнопки сброса и кнопки расчета
         */

        final JButton jButtonClear = new JButton("C");
        final JButton jButtonEqually = new JButton("=");

        jButtonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(jButtonClear.getText(), output);
            }
        });

        jButtonEqually.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(jButtonEqually.getText(), output);
            }
        });

        jButtonClear.setBounds(10, 250, 50, 50);
        jButtonEqually.setBounds(130, 250, 50, 50);
        add(jButtonClear);
        add(jButtonEqually);

        /**
         * Создание, добавление и "прослушивание" кнопок арифметических операций
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

        action[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(action[0].getText(), output);
            }
        });
        action[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(action[1].getText(), output);
            }
        });
        action[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(action[2].getText(), output);
            }
        });
        action[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(action[3].getText(), output);
            }
        });


        /**
         * Создание, добавление и прослушивание кнопок/цифр от 0 до 9
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
                if (i >= 7) {
                    if (i == 7) {
                        helperX = 10;
                        helperY = 190;
                    } else helperX += 60;
                }
                numbers[i].setBounds(helperX, helperY, 50, 50);
            }
            add(numbers[i]);
        }

        numbers[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[0].getText(), output);
            }
        });
        numbers[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[1].getText(), output);
            }
        });
        numbers[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[2].getText(), output);
            }
        });
        numbers[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[3].getText(), output);
            }
        });
        numbers[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[4].getText(), output);
            }
        });
        numbers[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[5].getText(), output);
            }
        });
        numbers[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[6].getText(), output);
            }
        });
        numbers[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[7].getText(), output);
            }
        });
        numbers[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[8].getText(), output);
            }
        });
        numbers[9].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calc.press(numbers[9].getText(), output);
            }
        });

        output.setBounds(10, 10, 230, 50);
        output.setEditable(false);
        add(output);

        /**
         * "прослушивание" клавиатуры
         */

        /*addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                boolean flag = false;
                char symbol = e.getKeyChar();
                //Context context = new Context(output);
                if (!Character.isDigit(symbol))
                    return;
                output.setText(output.getText() + symbol);
            }
        });*/
    }
}
