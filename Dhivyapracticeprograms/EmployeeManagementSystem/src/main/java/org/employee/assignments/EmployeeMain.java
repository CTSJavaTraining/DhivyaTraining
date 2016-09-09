package org.employee.assignments;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	private static final Logger log = Logger.getLogger(EmployeeMain.class);

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Press 1 to insert");
		System.out.println("Press 2 to update");
		System.out.println("Press 3 to delete");
		System.out.println("Press 4 to retrieve");

		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		switch (option) {
		case 1:
			CRUDOperations.insert();
			break;
		case 2:
			CRUDOperations.update();
			break;
		case 3:
			CRUDOperations.delete();
			break;
		case 4:
			CRUDOperations.retrieve();
			break;
		default:
			log.warn("Incorrect choice");
			break;
		}
	}

	public static SessionFactory FactoryProvider() {

		return new Configuration().configure().buildSessionFactory();
	}
}
