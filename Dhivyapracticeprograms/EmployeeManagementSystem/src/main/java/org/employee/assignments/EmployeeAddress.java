package org.employee.assignments;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employeeaddress")
public class EmployeeAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "fk_key")
	private EmployeeDetails employeeDetails;

	@Column(name = "street")
	private String street;

	@Column(name = "doorno")
	private int doorno;

	@Column(name = "state")
	private String state;

	public EmployeeAddress(String street, int doorno, String state) {
		this.street = street;
		this.doorno = doorno;
		this.state = state;
	}

	public EmployeeAddress() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the doorno
	 */
	public int getDoorno() {
		return doorno;
	}

	/**
	 * @param doorno
	 *            the doorno to set
	 */
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the employeeDetails
	 */
	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	/**
	 * @param employeeDetails
	 *            the employeeDetails to set
	 */
	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

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

}
