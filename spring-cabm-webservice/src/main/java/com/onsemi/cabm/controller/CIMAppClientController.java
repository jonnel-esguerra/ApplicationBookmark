package com.onsemi.cabm.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onsemi.cabm.model.CIMAppClient;
import com.onsemi.cabm.response.CIMAppClientResponse;
import com.onsemi.cabm.service.CIMAppClientService;

@RestController
@RequestMapping("/api/cimappclient/")
public class CIMAppClientController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CIMAppClientService cimAppClientService;

	@GetMapping(path = "/getAllCIMAppClient", produces = {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE})
	public List<CIMAppClientResponse> getAllCIMAppClient () {
		
		logger.info("/api/cimappclient/getAllCIMAppClient");
		
		List<CIMAppClient> cimAppClientList = cimAppClientService.getAllCIMAppClient();
		List<CIMAppClientResponse> cimAppClientResponseList = new ArrayList<CIMAppClientResponse>();
		
		cimAppClientList.stream().forEach(cimappclient -> {
			cimAppClientResponseList.add(new CIMAppClientResponse(cimappclient));
		});
		
		return cimAppClientResponseList;
		
	}
	
}
