package edu.marcus.ifelsehell.solution.factory;

import java.util.Map;
import java.util.Optional;

import edu.marcus.ifelsehell.operation.Addition;
import edu.marcus.ifelsehell.operation.Division;
import edu.marcus.ifelsehell.operation.Multiplication;
import edu.marcus.ifelsehell.operation.Operation;
import edu.marcus.ifelsehell.operation.Subtraction;

public class OperationFactory {
	
	/*
	 * To add a new operation just implement the interface Operation and
	 * register the new implementation to the OperationFactory.
	 */
	private static Map<String, Operation> operationMap = Map.of(
			"add", new Addition(),
			"subtract", new Subtraction(),
			"multiply", new Multiplication(),
			"divide", new Division());
	
	private OperationFactory() {}
 
    public static Operation getOperation(final String operator) {
        return Optional
        		.ofNullable(operationMap.get(operator))
        		.orElseThrow(() -> new IllegalArgumentException(String
        				.format("The following operator is not allowed: %s", operator)));
    }

}
