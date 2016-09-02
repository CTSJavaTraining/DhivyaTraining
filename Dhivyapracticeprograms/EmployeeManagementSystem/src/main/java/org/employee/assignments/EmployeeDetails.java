package org.employee.assignments;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employeedetails")
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "employeename")
	private String employeename;

	@Column(name = "designation")
	private String designation;

	@Column(name = "salary")
	private int salary;

	@Column(name = "bonus")
	private int bonus;

	@Column(name = "grade")
	private String grade;

	@Column(name = "email")
	private String email;

	@Column(name = "doj")
	private String doj;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeDetails")
	private List<EmployeeAddress> address;

	/**
	 * @return the id
	 */

	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the employeename
	 */
	public String getEmployeename() {
		return employeename;
	}

	/**
	 * @param employeename
	 *            the employeename to set
	 */
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the bonus
	 */
	public int getBonus() {
		return bonus;
	}

	/**
	 * @param bonus
	 *            the bonus to set
	 */
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the doj
	 */
	public String getDoj() {
		return doj;
	}

	/**
	 * @param doj
	 *            the doj to set
	 */
	public void setDoj(String doj) {
		this.doj = doj;
	}

	/**
	 * @return the address
	 */
	public List<EmployeeAddress> getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(List<EmployeeAddress> address) {
		this.address = address;
	}

	public String ValidateEmail(String email) {

		if (email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			System.out.println("valid");
			return email;
		} else {
			System.out.println("invalid");
		}

		return null;

	}

	int b = 0;

	public int BonusCalculation(String grade, int salary) {
		if (grade.equals('A')) {
			b = (8 * salary) / 100;
		} else if(grade.equals('B')){
			b = (int) ((6.5 * salary) / 100);
		}
		else
		{
			
		}
		return b;

	}

}