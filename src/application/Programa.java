package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		try {
			System.out.print("Name: ");
			String name = sc.nextLine(); 
			System.out.print("Gross Salary: $");
			Double grossSalary = sc.nextDouble(); 
			System.out.print("Tax: $");
			Double tax = sc.nextDouble();
			Employee emp = new Employee(name, grossSalary,tax);
			System.out.println(emp);
		}catch(RuntimeException e) {
			System.out.println("Input error...");
		}
		sc.close();
	}

}
