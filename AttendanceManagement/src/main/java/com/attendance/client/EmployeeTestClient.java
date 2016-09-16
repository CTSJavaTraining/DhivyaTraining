/**
 * 
 */
package com.attendance.client;

import java.util.ArrayList;
import java.util.List;

import com.attendance.DAOServiceImpl.EmployeeDAOImpl;
import com.attendance.entity.Employee;
import com.attendance.entity.EmployeeId;
import com.attendance.entity.MachineDetails;

/**
 * @author 542320
 *
 */
public class EmployeeTestClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeDAOImpl e = new EmployeeDAOImpl();
		MachineDetails md=new MachineDetails();
		md.setLocation("mepz");
		md.setMachineId("chn11");
		md.setMachineType("tn112");
		
		List<Employee> emplist = new ArrayList<>();

		Employee emp1 = new Employee();
        EmployeeId id = new EmployeeId(1,"xxx");
		
//		emp1.setId(id);
		
//		emp1.setFirstname("raj");
//		emp1.setLastname("rrr");
//		emp1.setStatus("active");
//		emp1.setUsertype("permt employee");
//		emp1.setMachinedetails(md);
//        
//		
//
//		emplist.add(emp1);

//		Employee emp2 = new Employee();
//		EmployeeId eid2=new EmployeeId();
//		eid1.setAccessCardno("ch888");
//		eid1.setEmployeeid(2);
//		emp2.setFirstname("xxx");
//		emp2.setLastname("yyyy");
//		emp1.setStatus("active");
//		emp1.setUsertype("ctrtr employee");
//		
//
//		emplist.add(emp2);
		//e.insert(emplist);
		
	
		
		e.deleteEmployee(id);

	}

}
