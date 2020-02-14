package edu.marcus.ifelsehell.solution.ruleengine;

import edu.marcus.ifelsehell.Calculator;

public class CalculatorUsingRuleEngine implements Calculator {

	@Override
	public int calculate(int a, int b, String operator) {
		var expression = new Expression(a, b, operator);
		var engine = new Engine();
		return engine.process(expression);
	}

}
