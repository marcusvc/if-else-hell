package edu.marcus.ifelsehell.solution.ruleengine;

import edu.marcus.ifelsehell.Calculator;

public class CalculatorUsingRuleEngine implements Calculator {

	@Override
	public int calculate(int a, int b, String operator) {
		Expression expression = new Expression(a, b, operator);
		Engine engine = new Engine();
		return engine.process(expression);
	}

}
