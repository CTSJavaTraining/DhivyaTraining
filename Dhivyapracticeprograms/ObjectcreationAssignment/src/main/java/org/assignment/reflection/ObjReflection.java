package org.assignment.reflection;

public class ObjReflection {


		private String name = "John";
		private int age = 23;
		private Integer sal = new Integer(5000);
		private Double incentive = new Double("12345.567");
		private boolean isEmployee = true;

		void display() {
			System.out.println(name);
			System.out.println(age);
			System.out.println(sal);
			System.out.println(incentive);
			System.out.println(isEmployee);
		}
	}

