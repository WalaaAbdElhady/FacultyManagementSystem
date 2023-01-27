import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Program {
	static Scanner keyboard = new Scanner(System.in);
	static ArrayList<Students> storestudents = new ArrayList<>();
	static ArrayList<Workers> storeworkers = new ArrayList<>();
	static ArrayList<Technicians> storetechnicians = new ArrayList<>();
	static ArrayList<Administrators> storeadministrators = new ArrayList<>();
	static ArrayList<Instructors> storeinstructors = new ArrayList<>();
	boolean exit = false;

	public static void main(String[] args) {

		Program menu = new Program();
		menu.runMenu();
	}

	public void runMenu() {
		printHeader();
		while (!exit) {
			printMenu();
			int choice = getInput();
			performAction(choice);
		}
	}

	private void printMenu() {
		System.out.println("1) Add person ");
		System.out.println("2) Remove persons ");
		System.out.println("3) Display persons ");
		System.out.println("4) Search persons ");
		System.out.println("5) Exit ");
	}

	private void printHeader() {
		System.out.println();
		System.out.println("\t Welcom to University System \t");
		System.out.println();
	}

	private int getInput() {
		 int choice = 0;
	        do{
	            boolean valid = false;
	            while (!valid){
	                System.out.print("Enter a valid choice ["+1+" : " + 5 + "]: ");
	                try{
	                    choice =Integer.parseInt(keyboard.nextLine());

	                    valid = true;
	                }
	                catch(Exception e){
	                	keyboard.nextLine();
	                    System.out.println("\nInvalid input. Please try again.\n");
	                }
	            }

	            if (choice < 1 || choice > 5)
	                System.out.println("Invalid choice. Please try again\n");
	            else
	                break;
	        }while(true);

	        return choice;
	}

	private void performAction(int choice) {
		switch (choice) {
		case 1:
			addPerson();
			break;
		case 2:
			RemovePerson();
			break;
		case 3:
			DisplayPerson();
			break;
		case 4:
			SearchPerson();
			break;
		case 5:
			System.out.println("Thank you for using our System");
			System.exit(0);
			break;
		default:
			System.out.println("Unkown error has occured");
			break;
		}

	}
	// **********************************AddPerson**************************************

	public static void addPerson() {
		System.out.println("1) Add Student ");
		System.out.println("2) Add Worker ");
		System.out.println("3) Add Instructor ");
		System.out.println("4) Add Technician ");
		System.out.println("5) Add Administrator ");
		int choice = -1;
		try {
			choice = Integer.parseInt(keyboard.nextLine());
		} catch (InputMismatchException e) {
			System.out.println("Invalid choice, please use only numbers");
		}
		switch (choice) {
		case 1:
			Students stu = new Students();
			System.out.println("Enter the firstName:");
			stu.setfName(keyboard.next());
			System.out.println("Enter the lastName:");
			stu.setlName(keyboard.next());
			System.out.println("Enter the Personalemail:");
			stu.setPersonalEmail(keyboard.next());
			System.out.println("Enter the Academicemail:");
			stu.setAcademicEmail(keyboard.next());
			System.out.println("Enter the level:");
			stu.setLevel(keyboard.nextInt());
			System.out.println("Enter the GPA:");
			stu.setGpa(keyboard.nextDouble());
			System.out.println("Enter the ID:");
			stu.setId(keyboard.nextInt());
			System.out.println("Enter the Phonenumber:");
			stu.setPhoneNumber(keyboard.nextInt());
			System.out.println("Enter the Adress:");
			stu.setAdress(keyboard.next());
			storestudents.add(stu);
			System.out.println("The student added successfully");
			break;
		case 2:
			Workers worker = new Workers();
			System.out.println("Enter the firstName:");
			worker.setfName(keyboard.next());
			System.out.println("Enter the lastName:");
			worker.setlName(keyboard.next());
			System.out.println("Enter the ID:");
			worker.setId(keyboard.nextInt());
			System.out.println("Enter the Department:");
			worker.setDepartment(keyboard.next());
			System.out.println("Enter the Salary:");
			worker.setSalary(keyboard.nextInt());
			System.out.println("Enter the Adress:");
			worker.setAdress(keyboard.next());
			System.out.println("Enter the Personalemail:");
			worker.setPersonalEmail(keyboard.next());
			System.out.println("Enter the Phonenumber:");
			worker.setPhoneNumber(keyboard.nextInt());
			storeworkers.add(worker);
			System.out.println("the worker added successfully");
			break;
		case 3:
			Instructors instructor = new Instructors();
			System.out.println("Enter the firstName:");
			instructor.setfName(keyboard.next());
			System.out.println("Enter the lastName:");
			instructor.setlName(keyboard.next());
			System.out.println("Enter the ID:");
			instructor.setId(keyboard.nextInt());
			System.out.println("Enter the Department:");
			instructor.setDepartment(keyboard.next());
			System.out.println("Enter the Salary:");
			instructor.setSalary(keyboard.nextInt());
			System.out.println("Enter the Adress:");
			instructor.setAdress(keyboard.next());
			System.out.println("Enter the Personalemail:");
			instructor.setPersonalEmail(keyboard.next());
			System.out.println("Enter the Academic_mail:");
			instructor.setAcademicEmail(keyboard.next());
			instructor.setOfficeLocation("The third floor");
			System.out.println("Enter the Phonenumber:");
			instructor.setPhoneNumber(keyboard.nextInt());
			storeinstructors.add(instructor);
			System.out.println("the instructor added successfully");
			break;
		case 4:
			Technicians Technician = new Technicians();
			System.out.println("Enter the firstName:");
			Technician.setfName(keyboard.next());
			System.out.println("Enter the lastName:");
			Technician.setlName(keyboard.next());
			System.out.println("Enter the ID:");
			Technician.setId(keyboard.nextInt());
			System.out.println("Enter the Specialty:");
			Technician.setSpecialty(keyboard.next());
			System.out.println("Enter the Salary:");
			Technician.setSalary(keyboard.nextInt());
			System.out.println("Enter the Adress:");
			Technician.setAdress(keyboard.next());
			System.out.println("Enter the Personalemail:");
			Technician.setPersonalEmail(keyboard.next());
			System.out.println("Enter the Phonenumber:");
			Technician.setPhoneNumber(keyboard.nextInt());
			storetechnicians.add(Technician);
			System.out.println("the Technician added successfully");
			break;
		case 5:
			Administrators Administrator = new Administrators();
			System.out.println("Enter the firstName:");
			Administrator.setfName(keyboard.next());
			System.out.println("Enter the lastName:");
			Administrator.setlName(keyboard.next());
			System.out.println("Enter the ID:");
			Administrator.setId(keyboard.nextInt());
			System.out.println("Enter the Responsibility:");
			Administrator.setResponsibility(keyboard.next());
			System.out.println("Enter the Adress:");
			Administrator.setAdress(keyboard.next());
			System.out.println("Enter the Personalemail:");
			Administrator.setPersonalEmail(keyboard.next());
			System.out.println("Enter the Phonenumber:");
			Administrator.setPhoneNumber(keyboard.nextInt());
			storeadministrators.add(Administrator);
			System.out.println("the Administrator added successfully");
			break;
		default:
			System.out.println("something error happens");
			break;
		}

	}

	// **************************RemovePerson*******************************************

	public static void RemovePerson() {
		System.out.println("1) Remove Student ");
		System.out.println("2) Remove Worker ");
		System.out.println("3) Remove Instructor ");
		System.out.println("4) Remove Technician ");
		System.out.println("5) Remove Administrator ");
		int choice = -1;
		try {
			choice = Integer.parseInt(keyboard.nextLine());
		} catch (InputMismatchException e) {
			System.out.println("Invalid choice, please use only numbers");
		}
		int ID;
		switch (choice) {
		case 1:
			System.out.println("Enter the ID of the student you want to delete");
			ID = keyboard.nextInt();
			Students student = new Students();
			for (int i = 0; i < storestudents.size(); i++) {
				student = storestudents.get(i);
				if (student.getId() == ID) {
					storestudents.remove(student);
				}
			}
			System.out.println("The student removed successfully");
			break;
		case 2:
			System.out.println("Enter the ID of the worker you want to delete");
			ID = keyboard.nextInt();
			Workers worker = new Workers();
			for (int i = 0; i < storeworkers.size(); i++) {
				worker = storeworkers.get(i);
				if (worker.getId() == ID) {
					storeworkers.remove(worker);
				}
			}
			System.out.println("The worker removed successfully");
			break;
		case 3:
			System.out.println("Enter the ID of the instructor you want to delete");
			ID = keyboard.nextInt();
			Instructors instructor = new Instructors();
			for (int i = 0; i < storeinstructors.size(); i++) {
				instructor = storeinstructors.get(i);
				if (instructor.getId() == ID) {
					storeinstructors.remove(instructor);
				}
			}
			System.out.println("The instructor removed successfully");
			break;
		case 4:
			System.out.println("Enter the ID of the technician you want to delete");
			ID = keyboard.nextInt();
			Technicians technician = new Technicians();
			for (int i = 0; i < storetechnicians.size(); i++) {
				technician = storetechnicians.get(i);
				if (technician.getId() == ID) {
					storetechnicians.remove(technician);
				}
			}
			System.out.println("The technician removed successfully");
			break;
		case 5:
			System.out.println("Enter the ID of the administrator you want to delete");
			ID = keyboard.nextInt();
			Administrators administrator = new Administrators();
			for (int i = 0; i < storeadministrators.size(); i++) {
				administrator = storeadministrators.get(i);
				if (administrator.getId() == ID) {
					storeadministrators.remove(administrator);
				}
			}
			System.out.println("The administrator removed successfully");
			break;
		default:
			System.out.println("something error happens");
			break;
		}

	}
	// **************************DisplayPersons*****************************************

	public static void DisplayPerson() {
		System.out.println("1) Display Students ");
		System.out.println("2) Display Workers ");
		System.out.println("3) Display Instructors ");
		System.out.println("4) Display Technicians ");
		System.out.println("5) Display Administrators ");
		int choice = -1;
		try {
			choice = Integer.parseInt(keyboard.nextLine());
		} catch (InputMismatchException e) {
			System.out.println("Invalid choice, please use only numbers");
		}
		switch (choice) {
		case 1:
			Students student = new Students();
			for (int i = 0; i < storestudents.size(); i++) {
				System.out.println("information of student number " + (i + 1) + " is");
				System.out.println("----------------------------");
				student = storestudents.get(i);
				System.out.print(student.toString());
			}
			break;
		case 2:
			Workers worker = new Workers();
			for (int i = 0; i < storeworkers.size(); i++) {
				System.out.println("information of worker number " + (i + 1) + " is");
				System.out.println("----------------------------");
				worker = storeworkers.get(i);
				System.out.println(worker.toString());
			}
			break;
		case 3:
			Instructors instructor = new Instructors();
			for (int i = 0; i < storeinstructors.size(); i++) {
				System.out.println("information of instructor number " + (i + 1) + " is");
				System.out.println("----------------------------");
				instructor = (Instructors) storeinstructors.get(i);
				System.out.println(instructor.toString());
			}
			break;
		case 4:
			Technicians technician = new Technicians();
			for (int i = 0; i < storetechnicians.size(); i++) {
				System.out.println("information of technician number " + (i + 1) + " is");
				System.out.println("----------------------------");
				technician = storetechnicians.get(i);
				System.out.println(technician.toString());
			}
			break;
		case 5:
			Administrators administrator = new Administrators();
			for (int i = 0; i < storeadministrators.size(); i++) {
				System.out.println("information of administrator number " + (i + 1) + " is");
				System.out.println("----------------------------");
				administrator = (Administrators) storeadministrators.get(i);
				System.out.println(administrator.toString());
			}
			break;
		default:
			System.out.println("something error happens");
			break;
		}

	}

	// **************************SearchPerson*******************************************
	public static void SearchPerson() {
		System.out.println("1) Search Student ");
		System.out.println("2) Search Worker ");
		System.out.println("3) Search Instructor ");
		System.out.println("4) Search Technician ");
		System.out.println("5) Search Administrator ");
		int choice = -1;
		try {
			choice = Integer.parseInt(keyboard.nextLine());
		} catch (InputMismatchException e) {
			System.out.println("Invalid choice, please use only numbers");
		}
		int id;
		switch (choice) {
		case 1:
			System.out.println("Enter ID of student you want to search");
			id = keyboard.nextInt();
			for (int i = 0; i < storestudents.size(); i++) {
				if (storestudents.get(i).getId() == id)
					System.out.println("The name of the student is " + storestudents.get(i).getfName() + "\n"
							+ "The GPA of the student is " + storestudents.get(i).getGpa());
				else
					System.out.println("The student not found");
			}
			break;
		case 2:
			System.out.println("Enter ID of Worker you want to search");
			id = keyboard.nextInt();
			for (int i = 0; i < storeworkers.size(); i++) {
				if (storeworkers.get(i).getId() == id)
					System.out.println("The name of the Worker is " + storeworkers.get(i).getfName() + "\n"
							+ "The Salary of the worker is " + storeworkers.get(i).getSalary());
				else
					System.out.println("The Worker not found");
			}
			break;
		case 3:
			System.out.println("Enter ID of Instructor you want to search");
			id = keyboard.nextInt();
			for (int i = 0; i < storeinstructors.size(); i++) {
				if (storeinstructors.get(i).getId() == id)
					System.out.println("The name of the Instructor is " + storeinstructors.get(i).getfName() + "\n"
							+ "The Salary of the Instructor is " + storeinstructors.get(i).getSalary());
				else
					System.out.println("The Instructor not found");
			}
			break;
		case 4:
			System.out.println("Enter ID of Technician you want to search");
			id = keyboard.nextInt();
			for (int i = 0; i < storetechnicians.size(); i++) {
				if (storetechnicians.get(i).getId() == id)
					System.out.println("The name of the Technician is " + storetechnicians.get(i).getfName() + "\n"
							+ "The Specialty of the Technician is " + storetechnicians.get(i).getSpecialty());
				else
					System.out.println("The Technician not found");
			}
			break;
		case 5:
			System.out.println("Enter ID of Administrator you want to search");
			id = keyboard.nextInt();
			for (int i = 0; i < storeadministrators.size(); i++) {
				if (storeadministrators.get(i).getId() == id)
					System.out.println("The name of the Administrator is " + storeadministrators.get(i).getfName()
							+ "\n" + "The Responsibility of the Administrator is "
							+ storeadministrators.get(i).getResponsibility());
				else
					System.out.println("The Administrator not found");
			}
			break;
		default:
			System.out.println("something error happens");
			break;

		}
	}
}