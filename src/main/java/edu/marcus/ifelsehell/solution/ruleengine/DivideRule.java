package edu.marcus.ifelsehell.solution.ruleengine;

import edu.marcus.ifelsehell.operation.Division;
import edu.marcus.ifelsehell.operation.Operation;

public class DivideRule implements Rule {
	
	private static Operation operation = new Division();
	
	@Override
	public boolean evaluate(Expression expression) {
		return expression.getOperator() == Operator.DIVIDE;
	}

	@Override
	public int getResult(Expression expression) {
		return operation.apply(expression.getA(), expression.getB());
	}

}
