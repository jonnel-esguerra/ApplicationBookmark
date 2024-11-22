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
@Table(schema = "ssmp", name = "CIMAPPGROUP")
public class CIMAppGroup {
	
	@Id
	@Column(name = "CAG_APPGROUPID")
	private String cagAppGroupID;
	
	@Column(name = "CAG_APPID")
	private String cagAppID;
	
	@Column(name = "CAG_USERID")
	private String cagUserID;
	
	@Column(name = "CAG_DATE")
	private String cagDate;

}
