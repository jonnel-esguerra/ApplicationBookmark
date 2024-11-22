package com.onsemi.cabl.restconsumer.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.onsemi.cabl.restconsumer.model.CIMAppGroupClient;
import com.onsemi.cabl.restconsumer.response.CIMAppGroupClientResponse;


@Service
public class CIMAppGroupClientServiceImpl implements CIMAppGroupClientService {
	
	private static final Logger logger = LoggerFactory.getLogger(CIMAppGroupClientService.class);
	
	@Autowired
	private RestTemplate restTemplate; 
	@Value("${restfulapi.base.url}")
	String baseUrl;
	@Value("${common.account}")
	String commonAccount;

	@Override
	public List<CIMAppGroupClientResponse> getCIMAppHostName(CIMAppGroupClient cimAppGroupClient, String hostName)
			throws JsonProcessingException {		
		logger.info("Method Name: getCIMPCHostName");
		String url;

		hostName = getHostName(hostName, baseUrl);
		
		url = baseUrl + hostName;
		logger.info(String.format("Request URL: %s", url));
		
		//CIMAppGroupClientResponse[] cimAppGroupClients = restTemplate.getForObject(url,
			//	CIMAppGroupClientResponse[].class, uriVariables);
		
		CIMAppGroupClientResponse[] cimAppGroupClients = restTemplate.getForObject(url,
				CIMAppGroupClientResponse[].class);
		
		List<CIMAppGroupClientResponse> list = Arrays.asList(cimAppGroupClients);
		logger.info(String.format("Records: %s", list.size()));
		for (int i = 0; i < list.size(); i++) {
			logger.info("Web Service Result: " + "\r\n" +
						"Host Name         - " + list.get(i).getHostName() + " \r\n" +
						"App ID            - " + list.get(i).getAppId() + " \r\n" +
						"App Group ID      - " + list.get(i).getAppGroupId() + " \r\n" + 						
						"App Name          - " + list.get(i).getAppName() + " \r\n" +
						"App Launcher      - " + list.get(i).getAppLauncher() + " \r\n" +
						"App Source        - " + list.get(i).getAppSource() + " \r\n" +
						"App Target        - " + list.get(i).getAppTarget() + " \r\n" +
						"App Image Source  - " + list.get(i).getAppImageSource() + " \r\n" +
						"App Panel Color   - " + list.get(i).getAppPanelColor());
		
		}	
				
		return list;

		
		
		
	}
	
	private String getJsonStringFromObject(CIMAppGroupClient cimAppGroupClient) throws JsonProcessingException{
		ObjectMapper mapper = new ObjectMapper();
		String uriVariables = mapper.writeValueAsString(cimAppGroupClient);
		return uriVariables;
	}
	
	private String getHostName (String clientIP, String baseUrl) {
		
		String url;
		url = baseUrl + clientIP;
		
		CIMAppGroupClientResponse[] cimAppGroupClients = restTemplate.getForObject(url,
				CIMAppGroupClientResponse[].class);		
		List<CIMAppGroupClientResponse> list = Arrays.asList(cimAppGroupClients);				
		if (list.size() > 0 && !list.isEmpty()) { 
			return clientIP;
		} else {					
			return commonAccount;
		}

	}


}
