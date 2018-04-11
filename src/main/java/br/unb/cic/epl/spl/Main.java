package br.unb.cic.epl.spl;

import br.unb.cic.epl.spl.add.Add;
import br.unb.cic.epl.spl.height.ExpressionTree;
import br.unb.cic.epl.spl.height.Node;
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


	//////

	Literal l = new Literal(12);
	Literal m = new Literal(16);
	Add l_m = new Add(l,m);
	Add ultra = new Add(l_m,m);


	ExpressionTree et = new ExpressionTree();
	String postfix = l_m.print();
	char[] charArray = postfix.toCharArray();
	Node root = et.constructTree(charArray);


	public void printNode(){
		System.out.println("Node: "+root.getValue());
	}

	public void createExpressions() {
		expressions.add(new Literal(101));
		expressions.add(ultra);
		//expressions.add(new Literal(10));
	}
	
	public static void main(String args[]) {
		instance().createExpressions();
		instance().printNode();
		for(Expression e: instance().expressions) {
			System.out.println(e.print());
			System.out.println(e.eval());
		}

	}
}
