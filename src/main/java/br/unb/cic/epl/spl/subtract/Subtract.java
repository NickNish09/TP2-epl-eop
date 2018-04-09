package br.unb.cic.epl.spl.subtract;

import br.unb.cic.epl.spl.Expression;

public class Subtract implements Expression{
    private Expression lhs;
    private Expression rhs;

    public Subtract(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public String print() {
        return "(" + lhs.print() + " - " + rhs.print() + ")";
    }
}
