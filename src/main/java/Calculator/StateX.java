package Calculator;

import javax.swing.*;

public class StateX extends State {

    boolean typing = false;

    /**
     * Код для десктопнонго приложения "Калькулятор"
     */

    void clear(Context context, JTextField output) {
        context.x = 0;
        context.y = 0;
        context.operation = "";
        output.setText("");

    }

    void digit(Context context, JTextField output, String key) {
        if (!typing) {
            context.x = 0;
            typing = true;
        }
        output.setText(output.getText() + (/*context.x * 10*/ +Character.getNumericValue(key.charAt(0))));
        context.x = Integer.parseInt(output.getText());
    }

    void arifm(Context context, JTextField output, String key) {
        context.state = new StateAction();
        context.state.arifm(context, output, key);
    }

    void equal(Context context, JTextField output) {
        context.state = new StateAnswer();
        context.state.equal(context, output);
    }

    /**
     * Код для консольной работы калькутятора
     */

    void clear(Context context) {
        context.x = 0;
        context.y = 0;
        context.operation = "+";
    }

    void digit(Context context, char key) {
        if (!typing) {
            context.x = 0;
            typing = true;
        }
        context.x = context.x * 10 + Character.getNumericValue(key);
    }

    void arifm(Context context, char key) {
        context.state = new StateAction();
        context.state.arifm(context, key);
    }

    void equal(Context context) {
        context.state = new StateAnswer();
        context.state.equal(context);
    }
}
