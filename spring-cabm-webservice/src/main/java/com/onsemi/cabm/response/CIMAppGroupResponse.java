package com.onsemi.cabm.response;


import com.onsemi.cabm.model.CIMAppGroup;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CIMAppGroupResponse {
	
	private String cagAppGroupID;
	
	private String cagAppID;
	
	private String cagUserID;
	
	private String cagDate;

	public CIMAppGroupResponse(CIMAppGroup  cimAppGroup) {
		this.cagAppGroupID = cimAppGroup.getCagAppGroupID();
		this.cagAppID = cimAppGroup.getCagAppID();
		this.cagUserID = cimAppGroup.getCagUserID();
		this.cagDate = cimAppGroup.getCagDate();
	}

	

}
