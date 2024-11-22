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

import com.onsemi.cabm.model.CIMAppAdmin;
import com.onsemi.cabm.response.CIMAppAdminResponse;
import com.onsemi.cabm.service.CIMAppAdminService;

@RestController
@RequestMapping("/api/cimappadmin")
public class CIMAppAdminController {
	
	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	CIMAppAdminService cimAppAdminService;
	
	@GetMapping(path = "/getAllCIMAppAdmin", produces = {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE})
	public List<CIMAppAdminResponse> getAllCIMAppAdmin () {
		
		logger.info("/api/cimappadmin/getAllCIMAppAdmin");
		
		List<CIMAppAdmin> cimAppAdminList = cimAppAdminService.getAllCIMAppAdmin();
		List<CIMAppAdminResponse> cimAppAdminResponseList = new ArrayList<CIMAppAdminResponse>();
		
		cimAppAdminList.forEach(cimappadmin -> {
			cimAppAdminResponseList.add(new CIMAppAdminResponse(cimappadmin));
		});
		
		return cimAppAdminResponseList;
	
	}
	
	
}
