package edu.marcus.ifelsehell.solution.ruleengine;

/**
 * Represents a desired operation.
 * Stores two values and the operator that must be applied to those values.
 */
public class Expression {

	private final int a;
	private final int b;
	private final Operator operator;
	
	public Expression(int a, int b, String operator) {
		this.a = a;
		this.b = b;
		this.operator = Operator.valueOf(operator);
	}

	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public Operator getOperator() {
		return operator;
	}
	
}
