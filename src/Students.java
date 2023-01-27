
public class Students extends Person {
	private int level;
	private double gpa;
	private String academicEmail;
	Students() {
	}

	public Students(int level, double gpa, String academicEmail) {
		super();
		this.level = level;
		this.gpa = gpa;
		this.academicEmail = academicEmail;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
        this.gpa= gpa;
	}

	public String getAcademicEmail() {
		return academicEmail;
	}

	public void setAcademicEmail(String academicEmail) {
		this.academicEmail = academicEmail;
	}


	public String toString() {
		return super.toString() + "The GPA is " + getGpa() + "\n" + "The ID is " + getId() + "\n" + "The level is "
				+ getLevel() + "\n" + "The Academic_mail is " + getAcademicEmail() + "\n" ;
	}

}
