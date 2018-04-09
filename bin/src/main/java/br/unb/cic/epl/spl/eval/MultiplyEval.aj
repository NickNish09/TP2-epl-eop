package br.unb.cic.epl.spl.eval;

public privileged aspect MultiplyEval {
    public Integer br.unb.cic.epl.spl.multiply.Multiply.eval() {
        return lhs.eval() * rhs.eval();
    }
}
