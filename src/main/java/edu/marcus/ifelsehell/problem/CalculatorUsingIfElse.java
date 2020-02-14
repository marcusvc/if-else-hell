package edu.marcus.ifelsehell.problem;

import edu.marcus.ifelsehell.Calculator;

public class CalculatorUsingIfElse implements Calculator {

	/*
	 * The sequence of if-else is a big problem on a long term period. This sequence
	 * tends to get bigger and bigger, increasing cyclomatic complexity Imagine a
	 * financial calculator with dozens of operations.
	 * Logic of operations is together with the operation decision.
	 * Tight coupling.
	 */
	public int calculate(int a, int b, String operator) {
		int result;
		if ("add".equals(operator)) {
			result = a + b;
		} else if ("multiply".equals(operator)) {
			result = a * b;
		} else if ("divide".equals(operator)) {
			result = a / b;
		} else if ("subtract".equals(operator)) {
			result = a - b;
		} else {
			throw new IllegalArgumentException(String.format("The following operator is not allowed: %s", operator));
		}
		return result;
	}

}
