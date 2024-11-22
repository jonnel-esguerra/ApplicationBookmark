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

import com.onsemi.cabm.model.CIMAppGroup;
import com.onsemi.cabm.response.CIMAppGroupResponse;
import com.onsemi.cabm.service.CIMAppGroupService;

@RestController
@RequestMapping("/api/cimappgroup/")
public class CIMAppGroupController {
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	CIMAppGroupService cimAppGroupService;
	
	@GetMapping(path = "/getAllCIMAppGroup", produces = {MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE})
	public List<CIMAppGroupResponse> getAllCIMAppGroup () {
		
		logger.info("/api/cimappgroup/getAllCIMAppGroup");
		
		List<CIMAppGroup> cimAppGroupList = cimAppGroupService.getAllCIMAppGroup();
		List<CIMAppGroupResponse> cimAppGroupResponseList = new ArrayList<CIMAppGroupResponse>();
		
		cimAppGroupList.forEach(cimappgroup -> {
			cimAppGroupResponseList.add(new CIMAppGroupResponse(cimappgroup));
		});
		
		return cimAppGroupResponseList;
	
	}
	
}
