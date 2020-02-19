package Calculator;

import javax.swing.*;

public class Context {
    int x;
    int y;
    //char o;
    String o;
    State state;

    public Context() {
        state = new StateX();
        //state.clear(this, output);
    }
    public Context(JTextField output) {
        state = new StateX();
        state.clear(this, output);
    }

    public void press(String key, JTextField output) {
        if (key.charAt(key.length() - 1) == 'C' || key.charAt((key.length() - 1)) == 'c') {
            state.clear(this, output);
        } else if (key.charAt((key.length() - 1)) == '0' || key.charAt((key.length() - 1)) == '1' || key.charAt((key.length() - 1)) == '2' || key.charAt((key.length() - 1)) == '3'
                || key.charAt((key.length() - 1)) == '4' || key.charAt((key.length() - 1)) == '5' || key.charAt((key.length() - 1)) == '6' || key.charAt((key.length() - 1)) == '7'
                || key.charAt(0) == '8' || key.charAt(0) == '9') {
            state.digit(this, output, key);
        } else if (key.charAt((key.length() - 1)) == '+' || key.charAt((key.length() - 1)) == '-' || key.charAt((key.length() - 1)) == '*' || key.charAt((key.length() - 1)) == '/') {
            state.arifm(this, output, key);
        } else if (key.charAt((key.length() - 1)) == '=')
            state.equal(this, output);
        }

    /**
     * Выполнение тестов
     * @param //keys
     * @return
     */
//    public int run(String keys, JTextField output) { //"C2+3="
//        /*for (char key : keys.toCharArray()) {
//            press(key);
//        }*/
//        /*for (int i = 0; i < keys.length(); i++){
//            press(keys.charAt(i));
//        }*/
//        press(keys, output);
//        return x;
//    }



    @Override
    public String toString() {
        return
                "x=" + x +
             "   y=" + y +
           "    op=" + o +
     "       state=" + state.getClass().getName();
    }
}
