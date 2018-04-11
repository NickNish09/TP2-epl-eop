package br.unb.cic.epl.spl;

import br.unb.cic.epl.spl.add.Add;
import br.unb.cic.epl.spl.height.ExpressionTree;
import br.unb.cic.epl.spl.height.Height;
import br.unb.cic.epl.spl.height.Node;

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


	//////

	Literal l = new Literal(7);
	Literal m = new Literal(3);
	Add l_m = new Add(l,m);
	Add ultra = new Add(l_m,m);
	Add semi_ultra = new Add(l_m,ultra);
    Height altura = new Height(l_m,ultra);
	public void createExpressions() {
		expressions.add(new Literal(101));
		expressions.add(ultra);
		expressions.add(altura);
		//expressions.add(new Literal(10));
	}
	
	public static void main(String args[]) {
		instance().createExpressions();
		for(Expression e: instance().expressions) {
			System.out.println("Expression: "+e.print());
			System.out.println("Conta: "+e.evaal());
			System.out.println("Altura: "+e.evalHeight());
		}

	}
}
