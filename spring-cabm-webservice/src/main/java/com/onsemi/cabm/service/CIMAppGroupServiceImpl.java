package com.onsemi.cabm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onsemi.cabm.model.CIMAppGroup;
import com.onsemi.cabm.repository.CIMAppGroupRepository;

@Service
public class CIMAppGroupServiceImpl implements CIMAppGroupService {

	@Autowired
	CIMAppGroupRepository cimAppGroupRepository;
	
	public List<CIMAppGroup> getAllCIMAppGroup() {
		return cimAppGroupRepository.findAll();
	}



}
