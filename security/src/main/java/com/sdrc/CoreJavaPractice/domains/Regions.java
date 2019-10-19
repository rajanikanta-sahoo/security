package com.sdrc.CoreJavaPractice.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Regions {

	@Id
	private Integer regionId;
	
	@Column
	private String region;
	
	@Column
	private String country;
}
