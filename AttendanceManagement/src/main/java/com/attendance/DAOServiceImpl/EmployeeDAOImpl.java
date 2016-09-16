/**
 * 
 */
package com.attendance.DAOServiceImpl;

import java.util.List;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;

import com.attendance.DAOService.EmployeeDAO;
import com.attendance.entity.Employee;
import com.attendance.entity.EmployeeId;
import com.attendance.util.JPAUtil;

/**
 * @author 542320
 *
 */

public class EmployeeDAOImpl implements EmployeeDAO{

	final static Logger logger = Logger.getLogger(EmployeeDAOImpl.class) ;
	
	 EntityManager entityManager = null;

	

	public void insertEmployee(List<Employee> emplist) throws Exception {
		

		logger.info("inserting a employee");
		try {
			entityManager = JPAUtil.getEntityManager();
			entityManager.getTransaction().begin();

			emplist.forEach( (emp) -> {
				
//				
				entityManager.persist(emp.getMachinedetails());
					entityManager.persist(emp);
					
				
			} );
			
		

			entityManager.getTransaction().commit();
			logger.info("Records inserted successfully");
		} catch (Exception e) {
			logger.info("Exception occurred:" + e);
		}

	}
	

	public void deleteEmployee(EmployeeId empId) {

		try {
			entityManager = JPAUtil.getEntityManager();
			entityManager.getTransaction().begin();
			logger.debug("Employee Id given:" + empId);
			Employee emp = (Employee) entityManager.find(Employee.class, empId);
			if (emp != null) {
//				entityManager.remove(emp);
				emp.setStatus("Inactive");
				entityManager.persist(emp);
				entityManager.getTransaction().commit();
				logger.info("Record Deleted Successfully");
			} else {
				logger.info("Entered EmpId is invalid.No such data present in DB");
			}
		} catch (Exception e) {
			logger.info("Exception occurred:" + e.getMessage());
		}
	}

}
