package com.onsemi.cabl.restconsumer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.onsemi.cabl.restconsumer.model.CIMAppGroupClient;
import com.onsemi.cabl.restconsumer.response.CIMAppGroupClientResponse;

@Service
public interface CIMAppGroupClientService {

	List <CIMAppGroupClientResponse> getCIMAppHostName (CIMAppGroupClient cimAppGroupClient, String hostName) throws JsonProcessingException;
	
}
