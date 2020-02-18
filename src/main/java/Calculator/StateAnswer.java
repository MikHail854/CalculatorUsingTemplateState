package Calculator;

import javax.swing.*;

public class StateAnswer extends State {

    void clear(Context context, JTextField output) {
        context.state = new StateX();
        context.state.clear(context, output);
    }

    void digit(Context context, JTextField output, String key) {
        context.state = new StateX();
        context.state.digit(context, output, key);
    }

    void arifm(Context context, String key) {
        context.state = new StateAction();
        context.state.arifm(context, key);
    }

    void equal(Context context, JTextField output) {
       int answer = 0;
       /*switch (context.o){
           case '+' : answer = context.x + context.y; break;
           case '-' : answer = context.x - context.y; break;
           case '*' : answer = context.x * context.y; break;
           case '/' : answer = context.x / context.y; break;
       }*/
       context.x = answer;
       //output.setText(String.valueOf(answer));
    }
}
