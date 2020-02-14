package edu.marcus.ifelsehell.solution.ruleengine;

/**
 * Represents a rule to be processed by a rule engine 
 */
public interface Rule {

	/**
	 * Evaluates a rule based on the operator of a given expression.
	 * 
	 * @param expression Stores the operator and the operands of a operation
	 * @return true if this rule has the same operator of
	 * the received expression and false otherwise.
	 */
	boolean evaluate(Expression expression);
	
	/**
	 * Apply this rule Operation and returns the value based on
	 * the received expression operands.
	 * 
	 * @param expression Stores the operator and the operands of a operation
	 * @return value of the operation
	 */
	int getResult(Expression expression);
}
