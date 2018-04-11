package br.unb.cic.epl.spl.eval;

public privileged aspect MultiplyEval {
    public Integer br.unb.cic.epl.spl.multiply.Multiply.eval() {
        return lhs.eval() * rhs.eval();
    }
    public Integer br.unb.cic.epl.spl.multiply.Multiply.evalHeight() {
        return Math.max(lhs.evalHeight(),rhs.evalHeight())+1;
    }
}
