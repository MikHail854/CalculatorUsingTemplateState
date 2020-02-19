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

    void arifm(Context context,  JTextField output, String key) {
        String helper = "";
        if (context.o == "") {
            context.o = key;
            output.setText(output.getText() + context.o);
        } else {
            helper = output.getText();
            context.o = key;
            output.setText(helper.substring(0, helper.length()-1) + context.o);
        }
    }

    void equal(Context context, JTextField output) {
        context.y = context.x;
        context.state = new StateAnswer();
        context.state.equal(context, output);
    }
}
