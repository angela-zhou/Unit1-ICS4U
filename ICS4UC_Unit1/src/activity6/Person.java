package activity6;

public abstract class Person {
	private String name;
	private long SIN;
	private int age;
	private char gender; 
	private String address;
	private String telephoneNumber;
	
	/**
	 * Constructors
	 */
	public Person() {
		
	}
	
	public Person(String name) {
		setName(name);
	}
	
	public Person(long SIN, int age, char gender, String address, String telephoneNumber) {
		setSIN(SIN);
		setAge(age);
		setGender(gender);
		setAddress(address);
		setTelephoneNumber(telephoneNumber);
	}
	
	/**
	 * Getters and Setters
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public long getSIN() {
		return SIN;
	}

	public void setSIN(long sIN) {
		SIN = sIN;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
}
