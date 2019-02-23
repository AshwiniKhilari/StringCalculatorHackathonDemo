package com.hackathon.demo;

import org.apache.commons.lang3.StringUtils;

public class StringCalculatorDemo {

	public static void main(String[] args) {
		System.out.println(" in main");

		int noOfTC = 0;
		if (StringUtils.isNumeric(args[0])) {
			System.out.println("No of test cases:" + args[0]);
			noOfTC = Integer.parseInt(args[0]);
		}

		for (int i = 1; i <= noOfTC; i++) {

			double result = StringCalculator.calculate(args[i]);

			System.out.println("Case # "+ i+":"+ result);
		}

	}

}