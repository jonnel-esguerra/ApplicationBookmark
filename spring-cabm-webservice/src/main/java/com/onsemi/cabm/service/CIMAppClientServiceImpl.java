package com.onsemi.cabm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onsemi.cabm.model.CIMAppClient;
import com.onsemi.cabm.repository.CIMAppClientRepository;

@Service
public class CIMAppClientServiceImpl implements CIMAppClientService {

	@Autowired
	CIMAppClientRepository cimAppClientRepository;
	
	public List<CIMAppClient> getAllCIMAppClient () {
		return cimAppClientRepository.findAll();
	}


}
