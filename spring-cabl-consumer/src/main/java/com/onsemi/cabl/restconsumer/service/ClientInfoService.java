package com.onsemi.cabl.restconsumer.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;




@Service
public interface ClientInfoService {
	
	String getClientIP (HttpServletRequest request);
	
	String getClientOS (HttpServletRequest request);
	
	String getClientBrowser(HttpServletRequest request);
	
	String getUserAgent(HttpServletRequest request);
}
