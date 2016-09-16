/**
 * 
 */
package com.attendance.DAOService;

import java.util.List;

import com.attendance.entity.Employee;
import com.attendance.entity.EmployeeId;


/**
 * @author 542320
 *
 */
public interface EmployeeDAO {
	
public void insertEmployee(List<Employee> emplist) throws Exception;

public void deleteEmployee(EmployeeId empId);

}
