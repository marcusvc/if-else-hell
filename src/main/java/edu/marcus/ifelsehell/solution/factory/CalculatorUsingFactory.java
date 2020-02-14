package edu.marcus.ifelsehell.solution.factory;

import edu.marcus.ifelsehell.Calculator;

public class CalculatorUsingFactory implements Calculator {
	
	/*
	 * No more if-else (or switch) hell.
	 * The logic of each operation is separated from the operation decision.
	 * Loosen coupling.
	 */
	@Override
	public int calculate(int a, int b, String operator) {
		var operation = OperationFactory.getOperation(operator);
		return operation.apply(a, b);
	}

}
