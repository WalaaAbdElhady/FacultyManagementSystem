
public class Workers extends Person {
	private String department;
	private int salary;

	Workers() {
	}

	public Workers(String department, int salary) {
		super();
		this.department = department;
		this.salary = salary;
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

		return super.toString() + "The ID is " + getId() + "\n" + "The Department is " + getDepartment() + "\n"
				+ "The Salary is " + getSalary();
	}

}
