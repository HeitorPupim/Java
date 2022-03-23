package app;

import java.util.Locale;
import java.util.Scanner;

import entity.Rectangle;

public class RectangleProgram {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		
		rectangle.showInitials();
		
		rectangle.a = sc.nextDouble();
		rectangle.b = sc.nextDouble();
		
		rectangle.calculateMeasurements();
		
		rectangle.showResults();
		
		
		sc.close();
	}

}
