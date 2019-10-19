package com.sdrc.CoreJavaPractice.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Departments {

	@Id
	private String department;
	
	@Column
	private String devision;
	
	
}
