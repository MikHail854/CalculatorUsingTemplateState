package Calculator;

import javax.swing.*;

public class StateY extends State {

    boolean typing = false;

    /**
     * Код для десктопнонго приложения "Калькулятор"
     */

    void clear(Context context, JTextField output) {
        context.state = new StateX();
        context.state.clear(context, output);
    }

    void digit(Context context, JTextField output, String key) {
        if (!typing) {
            context.y = 0;
            typing = true;
        }
        output.setText(output.getText() + (/*context.y * 10*/ +Character.getNumericValue(key.charAt(0))));
        context.y = context.y * 10 + Character.getNumericValue(key.charAt(0));
    }

    void arifm(Context context, JTextField output, String key) {//1+2+    ... 1+2=+
        equal(context, output);// =
        context.state.arifm(context, output, key);// +
    }

    void equal(Context context, JTextField output) {
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
        if (!typing){
            context.y = 0;
            typing = true;
        }
        context.y = context.y * 10 + Character.getNumericValue(key);
    }

    void arifm(Context context, char key) {//1+2+    ... 1+2=+
        equal(context);// =
        context.state.arifm(context, key);// +
    }

    void equal(Context context) {
        context.state = new StateAnswer();
        context.state.equal(context);
    }
}
