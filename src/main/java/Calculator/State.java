package Calculator;

import javax.swing.*;

public abstract class State {
    abstract void clear(Context context);

    abstract void digit(Context context, char key);

    abstract void arifm(Context context, char key);

    abstract void equal(Context context, JTextField output);

    /*abstract void clear(Context context, JTextField output);

    abstract void digit(Context context, JTextField output);

    abstract void arifm(Context context, JTextField output);

    abstract void equal(Context context, JTextField output);*/
}
