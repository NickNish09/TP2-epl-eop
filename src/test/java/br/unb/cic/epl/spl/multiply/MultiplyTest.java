package br.unb.cic.epl.spl.multiply;

import br.unb.cic.epl.spl.Literal;
import junit.framework.TestCase;

public class MultiplyTest extends TestCase {
    public void testPrint() {
        Literal literal1000 = new Literal(1000);
        Literal literal5 = new Literal(5);
        Multiply mult = new Multiply(literal1000,literal5);
        assertEquals("(1000 * 5)", mult.print());
        assertEquals("5000", mult.eval().toString());
    }
}
