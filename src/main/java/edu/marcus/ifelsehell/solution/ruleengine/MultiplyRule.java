package edu.marcus.ifelsehell.solution.ruleengine;

import edu.marcus.ifelsehell.operation.Multiplication;
import edu.marcus.ifelsehell.operation.Operation;

public class MultiplyRule implements Rule {
	
	private static Operation operation = new Multiplication();
	
	@Override
	public boolean evaluate(Expression expression) {
		return expression.getOperator() == Operator.MULTIPLY;
	}

	@Override
	public int getResult(Expression expression) {
		return operation.apply(expression.getA(), expression.getB());
	}

}
