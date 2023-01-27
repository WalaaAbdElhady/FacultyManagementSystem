
public class Technicians extends Person {
	private String specialty;
	private int salary;

	Technicians() {
	}

	public Technicians(String specialty, int salary) {
		super();
		this.specialty = specialty;
		this.salary = salary;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString() + "The ID is " + getId() + "\n" + "The Specialty is " + getSpecialty() + "\n"
				+ "The Salary is " + getSalary();
	}
}
