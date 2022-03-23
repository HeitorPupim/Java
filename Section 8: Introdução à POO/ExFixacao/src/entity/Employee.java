package entity;

import java.util.Scanner;

public class Employee {

	Scanner sc = new Scanner(System.in);
	
	public String Name;
	public double GrossSalary, Tax, Percentage, NetSalary;
	
	public void getEmployeeCredentials() {
		System.out.println("Name: ");
		this.Name = sc.nextLine();
		System.out.println("Gross saraly: ");
		this.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		this.Tax = sc.nextDouble();
		
		this.NetSalary = GrossSalary - Tax;	
		}

	public void increaseSalary() {
		System.out.println("Wich percentage to increase salary? ");
		this.Percentage = sc.nextDouble();
		this.NetSalary += GrossSalary*(Percentage/100);
	}
	
	
	public String toString() {
		return Name +", $" + NetSalary;
	}
}
