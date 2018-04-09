package br.unb.cic.epl.spl;

import br.unb.cic.epl.spl.add.Add;
import br.unb.cic.epl.spl.multiply.Multiply;
import br.unb.cic.epl.spl.subtract.Subtract;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private static Main instance; 
	
	private Main() {} 
	
	public static Main instance() {
		if(instance == null) {
			instance = new Main();
		}
		return instance; 
	}
	public List<Expression> expressions = new ArrayList<Expression>();

	Literal l = new Literal(12);
	Literal m = new Literal(16);
	public void createExpressions() {
		expressions.add(new Literal(101));
		expressions.add(new Literal(10));
	}
	
	public static void main(String args[]) {
		instance().createExpressions();
		
		for(Expression e: instance().expressions) {
			System.out.println(e.print());
			System.out.println(e.eval());
		}

	}
}
