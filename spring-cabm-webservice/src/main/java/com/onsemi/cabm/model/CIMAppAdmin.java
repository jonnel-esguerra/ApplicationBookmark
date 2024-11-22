package com.onsemi.cabm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="ssmp", name = "CIMAPPADMIN")
public class CIMAppAdmin {
	
	@Id
	@Column(name = "CAA_USERID")
	private String caaUserId;
	
	@Column(name = "CAA_FULLNAME")
	private String caaFullName;
	
	@Column(name = "CAA_DATE")
	private String caaDate;

}
