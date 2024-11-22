package com.onsemi.cabl.restconsumer.controller;



import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.onsemi.cabl.restconsumer.model.CIMAppGroupClient;
import com.onsemi.cabl.restconsumer.service.CIMAppGroupClientService;
import com.onsemi.cabl.restconsumer.service.ClientInfoService;


@Controller
public class CIMAppGroupClientController {
	private static final Logger logger = LoggerFactory.getLogger(CIMAppGroupClientController.class);	
	
	@Autowired
	CIMAppGroupClientService cimAppGroupClientService;
	
	@Autowired
	ClientInfoService clientInfoService;
	
	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(path = "/listMOSApps", method = RequestMethod.GET)
	public String getCIMApps( 
			@RequestParam(value = "cimAppGroupClient", required = false) CIMAppGroupClient cimAppGroupClient,
			Model model, HttpServletRequest request) throws JsonProcessingException {
			
			logger.info("URI: /listMOSApps");
			String clientip = clientInfoService.getClientIP(request);								
			logger.info("Client PC IP: " + clientip);					
			model.addAttribute("clientip", clientip);
			model.addAttribute("cimapps", cimAppGroupClientService.getCIMAppHostName(cimAppGroupClient, clientip));
		
		return "cimapps";
	}
}
