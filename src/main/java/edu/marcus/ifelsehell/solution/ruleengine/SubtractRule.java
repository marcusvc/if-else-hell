package edu.marcus.ifelsehell.solution.ruleengine;

import edu.marcus.ifelsehell.operation.Operation;
import edu.marcus.ifelsehell.operation.Subtraction;

public class SubtractRule implements Rule {
	
	private static Operation operation = new Subtraction();
	
	@Override
	public boolean evaluate(Expression expression) {
		return expression.getOperator() == Operator.SUBTRACT;
	}

	@Override
	public int getResult(Expression expression) {
		return operation.apply(expression.getA(), expression.getB());
	}

}
