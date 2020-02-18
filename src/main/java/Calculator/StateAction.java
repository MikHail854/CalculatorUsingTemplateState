package Calculator;

import javax.swing.*;

public class StateAction extends State {

    void clear(Context context, JTextField output) {
        context.state = new StateX();
        context.state.clear(context,output);
    }

    void digit(Context context, JTextField output, String key) {
        context.state = new StateY();
        context.state.digit(context, output, key);

    }

    void arifm(Context context, String key) {
        context.o = key;
    }

    void equal(Context context, JTextField output) {
        context.y = context.x;
        context.state = new StateAnswer();
        context.state.equal(context, output);
    }
}
