package com.sdrc.CoreJavaPractice.domains;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employees {

	@Id
	private Integer EmployeeId;
	
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private Date hireDate;
	@Column
	private String department;
	@Column
	private String gender;
	@Column
	private Integer salary;
	@Column
	private Integer regionId;
	
}
