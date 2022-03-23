package entities;


public class CurrencyConverter {
	
	public static final double IOF = 0.06;  //6% de IOF
	
	public static double convertBRL(double moneyPrice,double amountToBeConverted) {
		
		return (moneyPrice*amountToBeConverted)*(1 + IOF);
	}
	
	

}
