package Calculator;

import javax.swing.*;

public class StateY extends State {

    boolean typing = false;
    void clear(Context context, JTextField output) {
        context.state = new StateX();
        context.state.clear(context, output);
    }

    void digit(Context context, JTextField output, String key) {
        if (!typing){
            context.y = 0;
            typing = true;
        }
        //context.y = context.y * 10 + Character.getNumericValue(Integer.parseInt(key));
        output.setText(context.y * 10+ key);
    }

    void arifm(Context context, String key) {//1+2+    ... 1+2=+
        equal(context);// =
        context.state.arifm(context, key);// +
    }

    void equal(Context context) {

    }

    void equal(Context context, JTextField output) {
        context.state = new StateAnswer();
        context.state.equal(context, output);
    }
}
