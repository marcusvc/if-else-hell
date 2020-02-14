package edu.marcus.ifelsehell.solution.enumm;

/*
 * The problem of this solution is the tight coupling between
 * operator definition and operation logic
 */
public enum OperatorEnumWithOperationLogic {

	ADD {
		@Override
		public int apply(int a, int b) {
			return a + b;
		}
	},
	MULTIPLY {
		@Override
		public int apply(int a, int b) {
			return a * b;
		}
	},
	SUBTRACT {
		@Override
		public int apply(int a, int b) {
			return a - b;
		}
	},
	DIVIDE {
		@Override
		public int apply(int a, int b) {
			return a / b;
		}
	};

	public abstract int apply(int a, int b);
}
