package br.unb.cic.epl.spl.eval;

import br.unb.cic.epl.spl.Literal;

public privileged aspect Eval {
	public abstract Integer br.unb.cic.epl.spl.Expression.eval();
	public abstract Integer br.unb.cic.epl.spl.Expression.evalHeight();
	
	public Integer br.unb.cic.epl.spl.Literal.eval() {
		return value;
	}
	public Integer br.unb.cic.epl.spl.Literal.evalHeight() {
		return 1;
	}
	
	pointcut allMainMethods(): execution(* br.unb.cic.epl.spl.Main.*(**));
	
	pointcut createExp(br.unb.cic.epl.spl.Main m) : execution(void br.unb.cic.epl.spl.Main.createExpressions()) && target(m); 
	
	void around() : allMainMethods() {
		System.out.println("execucao do metodo: " + thisJoinPoint.getSignature().toLongString());
		proceed();
	}

	void around(br.unb.cic.epl.spl.Main m): createExp(m) {
		proceed(m);
		m.expressions.add(new br.unb.cic.epl.spl.Literal(10));
		m.expressions.add(new br.unb.cic.epl.spl.add.Add(new br.unb.cic.epl.spl.Literal(12),new br.unb.cic.epl.spl.Literal(16)));
		m.expressions.add(new br.unb.cic.epl.spl.subtract.Subtract(new br.unb.cic.epl.spl.Literal(12),new br.unb.cic.epl.spl.Literal(16)));
		m.expressions.add(new br.unb.cic.epl.spl.multiply.Multiply(new br.unb.cic.epl.spl.Literal(12),new br.unb.cic.epl.spl.Literal(16)));
	}

}
