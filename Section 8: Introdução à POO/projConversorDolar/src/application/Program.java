package application;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		double reaisPrice = CurrencyConverter.convertBRL(dollarPrice, amount);
		
		
		
		System.out.println("Amount to be paid in reais: " + String.format("%.2f", reaisPrice));
		
		
		
		sc.close();
	}

}
