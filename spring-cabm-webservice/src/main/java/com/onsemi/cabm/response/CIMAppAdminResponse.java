package com.onsemi.cabm.response;


import com.onsemi.cabm.model.CIMAppAdmin;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CIMAppAdminResponse {

	private String caaUserId;
	
	private String caaFullName;
	
	private String caaDate;

	public CIMAppAdminResponse(CIMAppAdmin cimAppAdmin) {		
		this.caaUserId = cimAppAdmin.getCaaUserId();
		this.caaFullName = cimAppAdmin.getCaaFullName();
		this.caaDate = cimAppAdmin.getCaaDate();
	}

	
	
	
}
