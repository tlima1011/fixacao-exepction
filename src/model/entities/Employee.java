package model.entities;

public class Employee {
	
	//Atributos 
	private String name; 
	private Double grossSalary;
	private Double tax;
	
	//Construtores 
	public Employee() { 
		
	}

	public Employee(String name, Double grossSalary, Double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	//Getters and Setters 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	public double netSalary() {
		return this.getGrossSalary() - this.getTax();
	}
	
	public void increaseSalary(double percentage) {
		
		this.grossSalary += grossSalary * percentage / 100.0;
		
	}
	@Override
	public String toString() {
		return "Name: " + name + " $ " + String.format("%.2f", netSalary());
	}
	

}
