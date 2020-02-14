package edu.marcus.ifelsehell.problem;

import edu.marcus.ifelsehell.Calculator;

public class CalculatorUsingSwitch implements Calculator {

	/*
	 * The switch approach looks more organized but tends to get bigger and bigger like the if-else approach.
	 * Logic of operations is together with the operation decision.
	 * Tight coupling. 
	 */
	public int calculate(int a, int b, String operator) {
		int result;
		switch (operator) {
		case "add":
			result = a + b;
			break;
		case "multiply":
			result = a * b;
			break;
		case "divide":
			result = a / b;
			break;
		case "subtract":
			result = a - b;
			break;
		default:
			throw new IllegalArgumentException(String.format("The following operator is not allowed: %s", operator));
		}
		return result;
	}

}
