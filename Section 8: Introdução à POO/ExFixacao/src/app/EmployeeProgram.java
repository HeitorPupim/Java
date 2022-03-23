package app;

import java.util.Locale;
import java.util.Scanner;

import entity.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		employee.getEmployeeCredentials();
		
		System.out.println("Employee: " + employee);
		
		employee.increaseSalary();
		
		System.out.println("Updated data: "+ employee);
		
		scan.close();
		
		
		


	}

}
