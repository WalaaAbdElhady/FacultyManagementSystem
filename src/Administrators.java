
public class Administrators extends Person {
	private String responsibility;
	private int salary;

	Administrators() {
	}

	public Administrators(String responsibility, int salary) {
		super();
		this.responsibility = responsibility;
		this.salary = salary;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {

		return super.toString() + "The Responsibility is " + getResponsibility() + "\n" + "The Salary is "
				+ getSalary();
	}

}
