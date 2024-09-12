package Salary;
import java.util.Scanner;
public class Salary_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sr = new Scanner(System.in);
		Salary salary = new Salary();
		
		
		System.out.print("Name: ");
		salary.setName(sr.nextLine());
		
		System.out.print("Salary: ");
		salary.setGrossSalary(sr.nextDouble());
		
		System.out.print("Tax: ");
		salary.setTax(sr.nextDouble());
		
		System.out.println("\nEmpoyee: " + salary);
		
		System.out.print("Whitch percentage to increase salary? " );
		double percentage = sr.nextDouble();
		salary.increaseSalary(percentage);
		
		System.out.println("\nUpdate data Salary:\n" + salary.toString2());
		
		sr.close();
	}

}
