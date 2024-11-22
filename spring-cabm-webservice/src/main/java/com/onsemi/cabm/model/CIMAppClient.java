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
@Table(schema="ssmp", name="CIMAPPCLIENT")
public class CIMAppClient {
	
	@Id
	@Column(name = "CAC_HOSTNAME")
	private String cacHostName;
	
	@Column(name = "CAC_APPGROUPID")
	private String cacAppGroupID;
	
	@Column(name = "CAC_USERID")
	private String cacUserID;
	
	@Column(name = "CAC_DATE")
	private String cacDate;

}
