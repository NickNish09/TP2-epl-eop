package br.unb.cic.epl.spl.height;

import br.unb.cic.epl.spl.Expression;

// Java program to construct an expression tree


public class Height extends {
    private Expression lhs;
    private Expression rhs;

    public Height(Expression lhs, Expression rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    public String print() {
        return "(" + lhs.print() + " + " + rhs.print() + ")";
    }
}
