package edu.marcus.ifelsehell.solution.enumm;

import edu.marcus.ifelsehell.Calculator;

public class CalculatorUsingOperatorEnumWithNoOperationLogic implements Calculator {

	@Override
	public int calculate(int a, int b, String operator) {
		OperatorEnumWithNoOperationLogic enumm = OperatorEnumWithNoOperationLogic.valueOf(operator);
		return enumm.getOperation().apply(a, b);
	}
	
}
