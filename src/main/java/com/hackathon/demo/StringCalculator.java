package com.hackathon.demo;

public class StringCalculator {

	public static double calculate(String input) {

		double result = 0;
		boolean isValid = validateInput(input);
		if (isValid) {
			evaluateExpression(input);
		}
		return result;
	}

	private static boolean validateInput(String input) {

		// 1 check if the input is valid

		return true;
	}

	private static double evaluateExpression(String input) {
		double result = 0.0;
		
		String[] byPluses = input.split("\\+");
		
				

		for (String multipl : byPluses) {
			String[] byMultipl = multipl.split("\\*");
			double multiplResult = 1.0;
			for (String operand : byMultipl) {
				if (operand.contains("/")) {
					String[] division = operand.split("\\/");
					double divident = Double.parseDouble(division[0]);
					for (int i = 1; i < division.length; i++) {
						divident /= Double.parseDouble(division[i]);
					}
					multiplResult *= divident;
				} else {
					multiplResult *= Double.parseDouble(operand);
				}
			}
			result += multiplResult;
		}

		return result;
	}

}
