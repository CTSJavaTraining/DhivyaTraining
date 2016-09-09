package org.employee.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CRUDOperations {
	private static final Logger log = Logger.getLogger(CRUDOperations.class);

	static EmployeeDetails emp = new EmployeeDetails();

	private static final SessionFactory sessionFactory = EmployeeMain.FactoryProvider();
	static Scanner sc = new Scanner(System.in);

	public static void insert() {

		List<EmployeeAddress> addressDetails = new ArrayList<>();
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		log.info("Transaction begins");

		emp.setEmployeename("xxx");
		emp.setDesignation("manager");
		emp.setSalary(14000);
		emp.setEmail(emp.ValidateEmail("abc@gmail.com"));
		emp.setGrade("A");
		emp.setDoj("12/2/2007");

		int bonus = emp.BonusCalculation(emp.getGrade(), emp.getSalary());
		emp.setBonus(bonus);

		EmployeeAddress addr = new EmployeeAddress();
		addr.setEmployeeDetails(emp);
		addr.setStreet("abc street");
		addr.setState("abc state");
		addr.setDoorno(123);
		addressDetails.add(addr);

		EmployeeAddress addr1 = new EmployeeAddress();
		addr1.setEmployeeDetails(emp);
		addr1.setStreet("def street");
		addr1.setState("def state");
		addr1.setDoorno(123);
		addressDetails.add(addr1);

		emp.setAddress(addressDetails);

		openSession.save(emp);
		openSession.getTransaction().commit();
		openSession.close();

	}

	public static void update() {
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		log.info("Transaction begins");
		System.out.println("Enter the id to be updated:");
		int empid = sc.nextInt();
		String hql = "UPDATE EmployeeDetails set employeename = :employeename " + "WHERE id = :id";
		Query query = openSession.createQuery(hql);
		query.setParameter("employeename", "yyy");
		query.setParameter("id", empid);
		int result = query.executeUpdate();
		log.info("Rows affected: " + result);
		if (result == 0) {
			log.info("No such id in DB");
		}

		openSession.getTransaction().commit();
		openSession.close();

	}

	public static void delete() {
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		log.info("Transaction begins");
		System.out.println("Enter the id to be deleted:");
		int empid = sc.nextInt();
		String hql1 = "DELETE FROM EmployeeAddress " + "WHERE id = :id";
		Query query1 = openSession.createQuery(hql1);
		query1.setParameter("id", empid);
		int results = query1.executeUpdate();
	
		log.info("Rows affected: " + results);
		if (results == 0) {
			log.info("No such id in DB");
		}
		openSession.close();

	}

	public static void retrieve() {
		Session openSession = sessionFactory.openSession();
		openSession.beginTransaction();
		log.info("Transaction begins");
		String hql1 = "SELECT state FROM EmployeeAddress";
		Query query1 = openSession.createQuery(hql1);
		List<?> results1 = query1.list();
		openSession.getTransaction().commit();
		log.info("state details : " + results1);
		log.info("success");
		if (results1.size() == 0) {
			log.info("can't be retrieved");
		}
		openSession.close();
		log.info("transaction closed");
	}

}
