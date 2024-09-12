package Salary;

public class Salary {

	//atributos
	private double grossSalary;
	private double tax;
	private String name;
	//Metodos GUETTERS e SETTERS
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//Metedos 
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
		public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage/100.0 ;
	}
		
	@Override
	public String toString() {
		return name + ", $" + String.format("%.2f", netSalary());
	}
	
	public String toString2() {
		return name + ", $" + String.format("%.2f", this.grossSalary);
	}
	
	
}
