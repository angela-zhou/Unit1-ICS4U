package activity6;

public class SalariedEmployees extends Employee {
	private double annualSalary;

	/**
	 * Constructors
	 */
	public SalariedEmployees() {
		
	}
	public SalariedEmployees(double annualSalary) {
		setAnnualSalary(annualSalary);
	}
	
	/**
	 * Getters and Setters
	 */
	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

}
