package entity;

public class Rectangle {
	
	public double a, b,
	area, perimeter, diagonal;
	
	
	public void showInitials() {
		System.out.println("Enter rectangle width and height");
	}
	
	public void calculateMeasurements() {
		this.area = a*b;
		this.perimeter = (2*a + 2*b);
		this.diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	public void showResults() {
		System.out.println("AREA = " + String.format("%.2f", area));
		System.out.println("PERIMETER = " + String.format("%.2f", perimeter));
		System.out.println("DIAGONAL = " + String.format("%.2f", diagonal));
		
	}

}
