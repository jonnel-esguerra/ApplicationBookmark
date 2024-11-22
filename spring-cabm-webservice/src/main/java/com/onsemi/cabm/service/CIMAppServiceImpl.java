package com.onsemi.cabm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onsemi.cabm.model.CIMApp;
import com.onsemi.cabm.repository.CIMAppRepository;

@Service
public class CIMAppServiceImpl implements CIMAppService {

	@Autowired
	CIMAppRepository cimAppRepository;
	
	public List<CIMApp> getAllCIMApp () {		
		return cimAppRepository.findAll();
	}
	

	public CIMApp getCIMAppById (String capAppID) {
		return cimAppRepository.findCIMAppById(capAppID);
	}
	
}
