package br.unb.cic.epl.spl.eval;

public privileged aspect SubtractEval {
    public Integer br.unb.cic.epl.spl.subtract.Subtract.eval() {
        return lhs.eval() - rhs.eval();
    }
}