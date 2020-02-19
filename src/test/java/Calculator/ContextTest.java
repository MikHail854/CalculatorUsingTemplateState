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

        assertEquals(0, context.run("С"));
        assertEquals(2, context.run("С2"));
        assertEquals(25, context.run("C25"));
        assertEquals(5, context.run("C2+3="));
        assertEquals(257452, context.run("С257452"));
        assertEquals(257452, context.run("C257452="));
        assertEquals(777, context.run("С123+654="));
        assertEquals(8, context.run("С2+2*2="));
        assertEquals(10, context.run("С5+="));
        assertEquals(100, context.run("С125-25="));
        assertEquals(20, context.run("С100/5="));
        assertEquals(56, context.run("С7*8="));
        assertEquals(2025, context.run("С45*45="));
        assertEquals(5625, context.run("С75*75="));
        assertEquals(57, context.run("С45-7*3/2="));
        assertEquals(1, context.run("С9/5="));
        assertEquals(0, context.run("С=231527*000="));
        assertEquals(50, context.run("С45+-+-+-/*+5="));
        assertEquals(45, context.run("С5+15=30="));
    }
}