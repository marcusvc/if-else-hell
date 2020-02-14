package edu.marcus.ifelsehell.solution.enumm;

import edu.marcus.ifelsehell.operation.Addition;
import edu.marcus.ifelsehell.operation.Division;
import edu.marcus.ifelsehell.operation.Multiplication;
import edu.marcus.ifelsehell.operation.Subtraction;
import edu.marcus.ifelsehell.operation.Operation;

/*
 * This solution separates operator definition and operation logic
 * Loose coupling. 
 */
public enum OperatorEnumWithNoOperationLogic {
	
	ADD(new Addition()),
	DIVIDE(new Division()),
	MULTIPLY(new Multiplication()),
	SUBTRACT(new Subtraction());
	
	private Operation operation;

	private OperatorEnumWithNoOperationLogic(Operation operation) {
		this.operation  = operation;
	}
	
	public Operation getOperation() {
		return operation;
	}
	
}
