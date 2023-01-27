
public abstract class Person {
	protected String fName, lName, adress, personalEmail;
	protected int phoneNumber, id;

	public Person() {
		super();
	}

	public Person(String fName, String lName, String adress, String personalEmail, int phoneNumber, int id) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.adress = adress;
		this.personalEmail = personalEmail;
		this.phoneNumber = phoneNumber;
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "The FirstName is " + getfName() + "\n" + "The LastName is " + getlName() + "\n" + "The Adress is "
				+ getAdress() + "\n" + "The Personal_email is " + getPersonalEmail() + "\n";
	}

}
