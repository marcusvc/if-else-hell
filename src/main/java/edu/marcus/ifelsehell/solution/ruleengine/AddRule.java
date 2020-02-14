package edu.marcus.ifelsehell.solution.ruleengine;

import edu.marcus.ifelsehell.operation.Addition;
import edu.marcus.ifelsehell.operation.Operation;

public class AddRule implements Rule {
	
	private static Operation operation = new Addition();
	
	@Override
	public boolean evaluate(Expression expression) {
		return expression.getOperator() == Operator.ADD;
	}

	@Override
	public int getResult(Expression expression) {
		return operation.apply(expression.getA(), expression.getB());
	}

}
