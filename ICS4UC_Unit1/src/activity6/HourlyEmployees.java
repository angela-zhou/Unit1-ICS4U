package activity6;

public class HourlyEmployees extends Employee {
	private double hourlyRate;
	private double hoursWorked;
	private double unionDues;
	
	/**
	 * Constructors
	 */
	public HourlyEmployees() {
		
	}
	
	public HourlyEmployees(double hourlyRate, double hoursWorked, double unionDues) {
		setHourlyRate(hourlyRate);
		setHoursWorked(hoursWorked);
		setUnionDues(unionDues);
	}
	
	/**
	 * Getters and Setters
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getUnionDues() {
		return unionDues;
	}

	public void setUnionDues(double unionDues) {
		this.unionDues = unionDues;
	}
	
}
