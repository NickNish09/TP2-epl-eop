package br.unb.cic.epl.spl.eval;

public privileged aspect HeightEval {
    public Integer br.unb.cic.epl.spl.height.Height.eval() {
        return lhs.eval() + rhs.eval();
    }

    public Integer br.unb.cic.epl.spl.height.Height.evalHeight() {
        return Math.max(lhs.evalHeight(),rhs.evalHeight())+1;
    }
}
