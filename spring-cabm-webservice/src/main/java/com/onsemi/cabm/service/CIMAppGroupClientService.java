package com.onsemi.cabm.service;

import java.util.List;

import com.onsemi.cabm.dto.CIMAppGroupClientDto;


public interface CIMAppGroupClientService {
	
	List <CIMAppGroupClientDto> getCIMAppGroupClientByHostName (String hostName);

}
