package com.greatlearning.main;
import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class Driver {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {	
		getInputDetails();
	}
		
	//Display Menu Items
	private static void getInputDetails() {
		int choice;
		String dept = "";
		Employee emp;
		String pass;
		String email;
		CredentialService cs = new CredentialService();
		System.out.println("Enter the first name");
		String fname = scanner.next();
		
		System.out.println("Enter the last name");
		String lname = scanner.next();
			
		System.out.println("Please enter the department from the following:");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		choice = scanner.nextInt();
		switch(choice) {
			case 1: 
				dept ="tech";
				break;
			case 2: 
				dept ="adm";
				break;
			case 3: 
				dept ="hr";
				break;
			case 4: 
				dept ="leg";
				break;
			default:
			System.out.println("Wrong Choice");
		}
		emp = new Employee(fname, lname, dept);
		cs.generateEmailAddress(emp);
		email = cs.generateEmailAddress(emp);
		pass = cs.generatePassword();
		cs.showCredentials(emp, email, pass);
	}
}
	

