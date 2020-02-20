package Calculator;

import javax.swing.*;

public class StateAnswer extends State {

    /**
     * Код для десктопнонго приложения "Калькулятор"
     */

    void clear(Context context, JTextField output) {
        context.state = new StateX();
        context.state.clear(context, output);
    }

    void digit(Context context, JTextField output, String key) {
        context.state = new StateX();
        context.state.digit(context, output, key);
    }

    void arifm(Context context, JTextField output, String key) {
        context.state = new StateAction();
        context.state.arifm(context, output, key);
    }

    void equal(Context context, JTextField output) {
        double answer = 0;
        switch (context.operation.charAt(0)) {
            case '+':
                answer = context.x + context.y;
                break;
            case '-':
                answer = context.x - context.y;
                break;
            case '*':
                answer = context.x * context.y;
                break;
            case '/':
                answer = context.x / context.y;
                break;
        }
        context.x = answer;
        output.setText(String.valueOf(answer));
    }

    /**
     * Код для консольной работы калькутятора
     */

    void clear(Context context) {
        context.state = new StateX();
        context.state.clear(context);
    }

    void digit(Context context, char key) {
        context.state = new StateX();
        context.state.digit(context, key);
    }

    void arifm(Context context, char key) {
        context.state = new StateAction();
        context.state.arifm(context, key);
    }

    void equal(Context context) {
        switch (context.o){
            case '+' : context.answer = context.x + context.y; break;
            case '-' : context.answer = context.x - context.y; break;
            case '*' : context.answer = context.x * context.y; break;
            case '/' : context.answer = context.x / context.y; break;
        }
        context.x = context.answer;
    }
}
