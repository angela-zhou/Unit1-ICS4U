package activity6;

public class Student extends Person {
	private double GPA;
	private String major;
	private int graduationYear;
	
	public Student(){
		
	}
	
	public Student(double GPA, String major, int graduationYear) {
		setGPA(GPA);
		setMajor(major);
		setGraduationYear(graduationYear);
	}
	
	/**
	 * Getters and setters
	 */
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGraduationYear() {
		return graduationYear;
	}
	public void setGraduationYear(int graduationYear) {
		this.graduationYear = graduationYear;
	}
	
}
