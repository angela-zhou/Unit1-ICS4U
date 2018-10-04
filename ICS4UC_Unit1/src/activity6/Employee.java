package activity6;

public class Employee extends Person {
	private String department;
	private String job;
	private int yearOfHire;
	
	/**
	 * Constructors
	 */
	public Employee() {
		
	}
	
	public Employee(String department, String job, int yearOfHire) {
		setDepartment(department);
		setJob(job);
		setYearOfHire(yearOfHire);
	}
	
	/**
	 * Getters and Setters
	 */
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public int getYearOfHire() {
		return yearOfHire;
	}
	public void setYearOfHire(int yearOfHire) {
		this.yearOfHire = yearOfHire;
	}

}
