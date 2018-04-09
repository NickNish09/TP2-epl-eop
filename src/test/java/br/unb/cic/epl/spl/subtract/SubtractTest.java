package br.unb.cic.epl.spl.subtract;

import br.unb.cic.epl.spl.Literal;
import junit.framework.TestCase;

public class SubtractTest extends TestCase {
    public void testPrint() {
        Literal literal1000 = new Literal(1000);
        Literal literal5 = new Literal(5);
        Subtract mult = new Subtract(literal1000,literal5);
        assertEquals("(1000 - 5)", mult.print());
        assertEquals("995", mult.eval().toString());
    }
}
