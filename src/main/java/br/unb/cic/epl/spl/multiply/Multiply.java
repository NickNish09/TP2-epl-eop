package br.unb.cic.epl.spl.multiply;

import br.unb.cic.epl.spl.Expression;

public class Multiply implements Expression {
    private Expression lhs;
    private Expression rhs;

    public Multiply(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public String print() {
        return "(" + lhs.print() + " * " + rhs.print() + ")";
    }

}
