
public class Instructors extends Person {
	private String academicEmail, officeLocation, department;
	private int salary;

	Instructors() {
	}

	public Instructors(String academicEmail, String officeLocation, String department, int salary) {
		super();
		this.academicEmail = academicEmail;
		this.officeLocation = officeLocation;
		this.department = department;
		this.salary = salary;
	}

	public String getAcademicEmail() {
		return academicEmail;
	}

	public void setAcademicEmail(String academicEmail) {
		this.academicEmail = academicEmail;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + "The Department is " + getDepartment() + "\n" + "The Office_location is "
				+ getOfficeLocation() + "\n" + "The salary is " + salary + "\n" + "The Academic_mail is "
				+ getAcademicEmail();
	}

}
