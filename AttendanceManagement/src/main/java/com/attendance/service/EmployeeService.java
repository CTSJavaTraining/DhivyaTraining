/**
 * 
 */
package com.attendance.service;

import java.util.List;

import com.attendance.entity.Employee;
import com.attendance.entity.EmployeeId;

/**
 * @author 542320
 *
 */
public interface EmployeeService {
	
	public void insertEmploye(List<Employee> empList);
	
	public void deleteEmploye(EmployeeId empId);

}
