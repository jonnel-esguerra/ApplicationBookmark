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

import com.onsemi.cabm.model.CIMApp;
import com.onsemi.cabm.response.CIMAppResponse;
import com.onsemi.cabm.service.CIMAppService;

@RestController
@RequestMapping("/api/cimapp/")
public class CIMAppController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CIMAppService cimAppService;
	
	@GetMapping(path = "getAllCIMApp", produces = {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE})
	public List<CIMAppResponse> getAllCIMApp () {
		
		logger.info("/api/cimapp/getAllCIMApp");
		
		List<CIMApp> cimAppList = cimAppService.getAllCIMApp();
		List<CIMAppResponse> cimAppResponseList = new ArrayList<CIMAppResponse>();
		
		cimAppList.stream().forEach(cimapp -> {
			cimAppResponseList.add(new CIMAppResponse(cimapp));
		});
		
		return cimAppResponseList;
	}
	
	@GetMapping("getCIMAppById/{capAppID}")
	public CIMAppResponse getCIMAppById (@PathVariable String capAppID) {
		//CIMApp cimapp = cimAppService.getCIMAppById(capAppID).orElseThrow(() -> new ResourceNotFoundException("Application not found for this id :: " + capAppID));		
		logger.info("/api/cimapp/getCIMAppById/" + capAppID);		
		
		CIMApp cimapp = cimAppService.getCIMAppById(capAppID);
		
		return new CIMAppResponse(cimapp);		
	}
}
