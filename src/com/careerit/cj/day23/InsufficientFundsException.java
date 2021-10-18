package com.careerit.cj.day23;

public class InsufficientFundsException extends RuntimeException {
	
		private static final long serialVersionUID = 762815415941493293L;
		String errorCode="SB000E1";
		public InsufficientFundsException() {
		}

		public InsufficientFundsException(String message) {
			super(message);
		}

		@Override
		public String toString() {
			return "InsufficientFundsException [errorCode=" + errorCode + "]";
		}
		
		
		
}
