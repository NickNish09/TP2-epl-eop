package br.unb.cic.epl.spl.eval;

public privileged aspect SubtractEval {
    public Integer br.unb.cic.epl.spl.subtract.Subtract.eval() {
        return lhs.eval() - rhs.eval();
    }
    public Integer br.unb.cic.epl.spl.subtract.Subtract.evalHeight() {
        return Math.max(lhs.evalHeight(),rhs.evalHeight())+1;
    }
}