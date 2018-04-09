package br.unb.cic.epl.spl.add;

import br.unb.cic.epl.spl.Literal;
import junit.framework.TestCase;

public class AddTest extends TestCase {
    public void testPrint() {
        Literal literal1000 = new Literal(1000);
        Literal literal5 = new Literal(5);
        Add mult = new Add(literal1000,literal5);
        assertEquals("(1000 + 5)", mult.print());
        assertEquals("1005", mult.eval().toString());
    }
}
