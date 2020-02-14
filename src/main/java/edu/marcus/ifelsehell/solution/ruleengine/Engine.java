package edu.marcus.ifelsehell.solution.ruleengine;

import java.util.List;

public class Engine {

	private static List<Rule> rules = List.of(
			new AddRule(),
			new DivideRule(),
			new MultiplyRule(),
			new SubtractRule());
	
	public int process(final Expression expression) {
        return rules
          .stream()
          .filter(r -> r.evaluate(expression))
          .findFirst()
          .map(r -> r.getResult(expression))
          .orElseThrow(() -> new IllegalArgumentException(String
  				.format("The following operator is not allowed: %s", expression.getOperator())));
    }

}
