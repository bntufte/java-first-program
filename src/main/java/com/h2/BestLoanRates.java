package com.h2;

import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
	public static final Map<Integer, Float> bestRates = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name");
		System.out.print("\n");
		String name = scanner.nextLine();
		System.out.print("Hello " + name);
		System.out.print("\n");
		System.out.print("Enter the loan term (in years)");
		System.out.print("\n");
		int loanTermInYears = scanner.nextInt();
		float bestRate = getRates(loanTermInYears);
		if (Float.compare(bestRate, 0.0f) == 0) {
			System.out.print("No available rates for term: " + loanTermInYears + " years");
			System.out.print("\n");
		}
		else {
			System.out.print("Best Available Rate: " + getRates(loanTermInYears) + "%");
			System.out.print("\n");
		}
		scanner.close();
	}
	
	public static float getRates(int loanTermInYears) {
		if (bestRates.containsKey(loanTermInYears))
			return bestRates.get(loanTermInYears);
		return 0.0f;
	}
}
