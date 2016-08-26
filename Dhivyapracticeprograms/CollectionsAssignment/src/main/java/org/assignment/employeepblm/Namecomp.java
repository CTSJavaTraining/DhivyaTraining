package org.assignment.employeepblm;



import java.util.Comparator;

public class Namecomp {
	public static Comparator<Employee> EmpNameComparator = new Comparator<Employee>() {

        public int compare(Employee emp1, Employee emp2) {
               String EmployeeName1 = emp1.getEmpname().toUpperCase();
               String EmployeeName2 = emp2.getEmpname().toUpperCase();
               System.out.println(EmployeeName1);
               System.out.println(EmployeeName2);
               // ascending order
               return EmployeeName1.compareTo(EmployeeName2);

        }
 };
}
