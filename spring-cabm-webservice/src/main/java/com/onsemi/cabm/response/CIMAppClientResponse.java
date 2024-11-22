package com.onsemi.cabm.response;

import com.onsemi.cabm.model.CIMAppClient;

import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class CIMAppClientResponse {

	
	private String cacHostName;
	
	private String cacAppGroupID;
	
	private String cacUserID;
	
	private String cacDate;

	public CIMAppClientResponse(CIMAppClient cimAppClient) {
		this.cacHostName = cimAppClient.getCacHostName();
		this.cacAppGroupID = cimAppClient.getCacAppGroupID();
		this.cacUserID = cimAppClient.getCacUserID();
		this.cacDate = cimAppClient.getCacDate();
	}
	
	
	
}
