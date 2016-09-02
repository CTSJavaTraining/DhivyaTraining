package org.employee.assignments;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	private static org.apache.log4j.Logger log = Logger.getLogger(EmployeeMain.class);

	public static void main(String[] args) {

		List<EmployeeAddress> addressDetails = new ArrayList<>();

		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmployeename("xxx");
		emp.setDesignation("manager");
		emp.setSalary(14000);
		emp.setEmail(emp.ValidateEmail("abc@gmail.com"));
		emp.setGrade("A");
		emp.setAddress(addressDetails);
		emp.setDoj("12/2/2007");

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

		int bonus = emp.BonusCalculation(emp.getGrade(), emp.getSalary());
		emp.setBonus(bonus);

		try {
			Configuration configuration = new Configuration().configure();
			Session openSession = configuration.buildSessionFactory().openSession();
			Transaction beginTransaction = openSession.beginTransaction();
			// Get Session
			System.out.println("Session created");
			// start transaction
			openSession.save(emp);

			// To update the database

			String hql = "UPDATE EmployeeDetails set employeename = :employeename " + "WHERE id = :id";
			Query query = openSession.createQuery(hql);
			query.setParameter("employeename", "yyy");
			query.setParameter("id", 1);
			int result = query.executeUpdate();
			log.warn("Rows affected: " + result);

			// To delete a row
			String hql1 = "DELETE FROM EmployeeAddress " + "WHERE id = :id";
			Query query1 = openSession.createQuery(hql1);
			query1.setParameter("id", 2);
			int results = query1.executeUpdate();
			log.warn("Rows affected: " + results);

			beginTransaction.commit();

		} catch (Exception e) {
			System.out.println("Exception occured. " + e.getMessage());
			e.printStackTrace();
		} finally {

		}

	}

}
