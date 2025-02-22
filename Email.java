package emailAdministrationApplication;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";

	// constructor to recieve the first name and last name
	public Email(String firstName, String lastName) {
		this.firstname = firstName;
		this.lastname = lastName;
		System.out.println("EMAIL CREATED: " + this.firstname + " " + this.lastname);

		// call a method for the department-return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);

		// call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);

		// combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	private String setDepartment() {
		// TODO Auto-generated method stub
		System.out.println(
				"DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");
		Scanner sc = new Scanner(System.in);
		int deptChoice = sc.nextInt();
		if (deptChoice == 1) {
			return "sales";
		} else if (deptChoice == 2) {
			return "dev";
		} else if (deptChoice == 3) {
			return "acc";
		} else {
			return "";
		}
	}

	// set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	// set the alternate email
	public void nchangePassword(String password) {
		this.password = password;
	}

	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "DISPLAY NAME: " + firstname + " " + lastname + "\nCOMANY EMAIL: " + email + "\nMAILBOX CAPACITY: "
				+ mailboxCapacity + "mb";
	}

}
