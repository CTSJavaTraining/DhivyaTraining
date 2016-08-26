package org.assignment.employeepblm;

public class Employee {
	

		private String Empname;
	    private int Id;
	    private String designation;
	    private String DOJ;
	    private String street;
	    private int salary;

	    public Employee(String Empname, int Id, String designation, String DOJ, String street, int salary) {
	           this.Empname = Empname;
	           this.Id = Id;
	           this.designation = designation;
	           this.DOJ = DOJ;
	           this.street = street;
	           this.salary = salary;
	    }

	    /**
	    * @return the Empname
	    */
	    public String getEmpname() {
	           return Empname;
	    }

	    /**
	    * @param empname
	    *            the empname to set
	    */
	    public void setEmpname(String empname) {
	           Empname = empname;
	    }

	    /**
	    * @return the id
	    */
	    public int getId() {
	           return Id;
	    }

	    /**
	    * @param id
	    *            the id to set
	    */
	    public void setId(int id) {
	           Id = id;
	    }

	    public String getDesignation() {
	           return designation;
	    }

	    public void setDesignation(String designation) {
	           this.designation = designation;
	    }

	    public String getDOJ() {
	           return DOJ;
	    }

	    public void setDOJ(String dOJ) {
	           DOJ = dOJ;
	    }

	    public String getStreet() {
	           return street;
	    }

	    public void setStreet(String street) {
	           this.street = street;
	    }

	    public int getSalary() {
	           return salary;
	    }

	    public void setSalary(int salary) {
	           this.salary = salary;
	    }

	    public String toString() {
	           return "[ id=" + Id + ", name=" + Empname + " ,DOJ1=" + DOJ + "]";
	    }


	}



