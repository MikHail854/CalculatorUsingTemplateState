package Calculator;

import static org.junit.Assert.*;

public class ContextTest {

    @org.junit.Test
    public void run() throws Exception {
        Context context = new Context();

        /*int actual = context.run("C2+3=");
        int expect = 5;
        assertEquals(expect, actual);*/

        /**
         * запись в комментариях, аналогична записи:
         * assertEquals(5, context.run("C2+3="));
         */

        assertEquals(0,context.run("C"), context.answer);
        assertEquals(2,context.run("C2"), context.answer);
        assertEquals(25,context.run("C25"), context.answer);
        assertEquals(5,context.run("C2+3="), context.answer);
        assertEquals(257452,context.run("C257452"), context.answer);
        assertEquals(257452,context.run("C257452="), context.answer);
        assertEquals(777,context.run("C123+456="), context.answer);
        assertEquals(8,context.run("C2+2*2"), context.answer);
        assertEquals(10,context.run("C5+="), context.answer);
        assertEquals(100,context.run("C125-25="), context.answer);
        assertEquals(20,context.run("C100/5="), context.answer);
        assertEquals(56,context.run("C7*8="), context.answer);
        assertEquals(2025,context.run("C45*45="), context.answer);
        assertEquals(5625,context.run("C75*75="), context.answer);
        assertEquals(57,context.run("C45-7*3/2="), context.answer);
        assertEquals(1.8,context.run("C9/5="), context.answer);
        assertEquals(0,context.run("C=231527*000="), context.answer);
        assertEquals(50,context.run("C45+-+-+-+-/*+5="), context.answer);
        assertEquals(45,context.run("C5+15=30="), context.answer);
    }
}