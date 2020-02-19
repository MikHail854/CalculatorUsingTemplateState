package Calculator;

import javax.swing.*;

public class StateAction extends State {

    /**
     * Код для десктопнонго приложения "Калькулятор"
     */

    void clear(Context context, JTextField output) {
        context.state = new StateX();
        context.state.clear(context, output);
    }

    void digit(Context context, JTextField output, String key) {
        context.state = new StateY();
        context.state.digit(context, output, key);

    }

    void arifm(Context context, JTextField output, String key) {
        String helper = "";
        if (context.operation == "") {
            context.operation = key;
            output.setText(output.getText() + context.operation);
        } else {
            helper = output.getText();
            context.operation = key;
            if (context.y == 0) {
                output.setText(helper.substring(0, helper.length() - 1) + context.operation);
            } else {
                output.setText(helper + context.operation);
            }
        }
    }

    void equal(Context context, JTextField output) {
        context.y = context.x;
        context.state = new StateAnswer();
        context.state.equal(context, output);
    }

    /**
     * Код для консольной работы калькутятора
     */

    void clear(Context context) {
        context.state = new StateX();
        context.state.clear(context);
    }

    void digit(Context context, char key) {
        context.state = new StateY();
        context.state.digit(context, key);
    }

    void arifm(Context context, char key) {
        context.o = key;
    }

    void equal(Context context) {
        context.y = context.x;
        context.state = new StateAnswer();
        context.state.equal(context);
    }
}
