package com.onsemi.cabm.controller;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onsemi.cabm.dto.CIMAppGroupClientDto;
import com.onsemi.cabm.response.CIMAppGroupClientResponse;
import com.onsemi.cabm.service.CIMAppGroupClientService;


@RestController
@RequestMapping("/api/cimappgroupclient/")
public class CIMAppGroupClientController {

	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CIMAppGroupClientService cimAppGroupClientService;
	
	@GetMapping(path = "getCIMAppByHost/{hostName}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List <CIMAppGroupClientResponse> getCIMAppByHost (@PathVariable String hostName) {		
		
		logger.info("/api/cimappgroupclient/getCIMAppByHost/" + hostName);
		
		List<CIMAppGroupClientDto> cimAppByHostList = cimAppGroupClientService.getCIMAppGroupClientByHostName(hostName);
		List<CIMAppGroupClientResponse> cimAppByHostResponseList = new ArrayList<CIMAppGroupClientResponse>();
		
		
		cimAppByHostList.stream().forEach(cimappbyhost -> {
			cimAppByHostResponseList.add(new CIMAppGroupClientResponse(cimappbyhost));
		});
		
		return cimAppByHostResponseList;		
	}
}
