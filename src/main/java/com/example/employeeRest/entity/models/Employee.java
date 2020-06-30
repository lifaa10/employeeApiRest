package com.example.employeeRest.entity.models;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="employee")
public class Employee implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_employee")
	private long idEmployee;
	
	@Column(name = "first_name")
	@NotNull
	private String firstName;
	
	@Column(name = "middle_initial")
	private String middleInitial;
	
	@Column(name = "last_name")
	@NotNull
	private String lastName;
	
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	
	@Column(name = "date_of_employment")
	private String dateOfEmployment;
	
	@Column(name = "status")
	@NotNull
	private String status;
	
	

	public Employee() {
		super();
	}
	
	

	public Employee(@NotNull String firstName, String middleInitial, @NotNull String lastName, String dateOfBirth,
			String dateOfEmployment, @NotNull String status) {
		super();
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfEmployment = dateOfEmployment;
		this.status = status;
	}



	public Employee(int idEmployee, @NotNull String firstName, String middleInitial, @NotNull String lastName,
			String dateOfBirth, String dateOfEmployment, @NotNull String status) {
		super();
		this.idEmployee = idEmployee;
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.dateOfEmployment = dateOfEmployment;
		this.status = status;
	}

	public long getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(long idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDateOfEmployment() {
		return dateOfEmployment;
	}

	public void setDateOfEmployment(String dateOfEmployment) {
		this.dateOfEmployment = dateOfEmployment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
