package org.assignment.employeepblm;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Empmain {
	public static void main(String args[]) {
		List<Employee> arraylist = new LinkedList<Employee>();
		arraylist.add(new Employee("Chaitanya", 126, "manager", "12/01/15", "abc", 50000));
		arraylist.add(new Employee("Rahul", 224, "analyst", "11/02/15", "jbh", 25000));
		arraylist.add(new Employee("Ajeet", 332, "lead", "13/03/15", "mnb", 45000));
		arraylist.add(new Employee("Prajeet", 733, "trainee", "31/04/15", "bgt", 20000));
		arraylist.add(new Employee("Sajeet", 934, "associate", "6/05/15", "hgf", 30000));
		arraylist.add(new Employee("sweet", 623, "programmer", "4/09/15", "jbv", 17000));
		arraylist.add(new Employee("Ajeeb", 916, "trainee", "05/09/15", "lkj", 20000));
		arraylist.add(new Employee("Ajin", 737, "analyst", "10/09/15", "oiu", 25000));
		arraylist.add(new Employee("Atith", 308, "associate", "20/11/15", "dfg", 30000));
		arraylist.add(new Employee("tina", 139, "trainee", "22/12/15", "lkj", 20000));
		System.out.println("DOJ sorting");
		System.out.println(arraylist);
		System.out.println("EMPLOYEE Name Sorting:");
		Collections.sort(arraylist, Namecomp.EmpNameComparator);

		for (Employee empdet : arraylist) {

			System.out.println(empdet);
		}

		System.out.println("Enter the id to be deleted:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Iterator<Employee> iterator = arraylist.iterator();
		while (iterator.hasNext()) {
			Employee next = iterator.next();
			if (next.getId() == n) {

				iterator.remove();
			}
		}

		for (Employee empdet : arraylist) {

			System.out.println(empdet);
		}

	}

}
