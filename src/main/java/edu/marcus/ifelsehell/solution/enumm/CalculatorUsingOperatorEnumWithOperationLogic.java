package edu.marcus.ifelsehell.solution.enumm;

import edu.marcus.ifelsehell.Calculator;

public class CalculatorUsingOperatorEnumWithOperationLogic implements Calculator {

	@Override
	public int calculate(int a, int b, String operator) {
		OperatorEnumWithOperationLogic enumm = OperatorEnumWithOperationLogic.valueOf(operator);
		return enumm.apply(a, b);
	}

}
