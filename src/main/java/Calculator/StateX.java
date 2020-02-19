package Calculator;

import javax.swing.*;

public class StateX extends State {

    boolean typing = false;

    void clear(Context context, JTextField output) {
        context.x = 0;
        context.y = 0;
        //context.o = '+';
        context.o = "";
        output.setText("");

    }

    void digit(Context context, JTextField output, String key) {
        if (!typing) {
            context.x = 0;
            typing = true;
        }
        //context.x = context.x * 10 + Character.getNumericValue(Integer.parseInt(key));
        output.setText(output.getText() +  (/*context.x * 10*/ + Character.getNumericValue(key.charAt(0))));
        context.x = Integer.parseInt(output.getText());
        //output.setText(output.getText() +  (context.x * 10 + Character.getNumericValue(key.charAt(0))));
    }

    void arifm(Context context,  JTextField output, String key) {
        context.state = new StateAction();
        context.state.arifm(context, output, key);
    }

    void equal(Context context, JTextField output) {
        context.state = new StateAnswer();
        context.state.equal(context, output);
    }
}
