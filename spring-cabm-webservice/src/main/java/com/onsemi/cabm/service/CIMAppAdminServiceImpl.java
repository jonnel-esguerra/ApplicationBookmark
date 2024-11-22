package com.onsemi.cabm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onsemi.cabm.model.CIMAppAdmin;
import com.onsemi.cabm.repository.CIMAppAdminRepository;

@Service
public class CIMAppAdminServiceImpl implements CIMAppAdminService {

	@Autowired
	CIMAppAdminRepository cimAppAdminRepository;
	
	@Override
	public List<CIMAppAdmin> getAllCIMAppAdmin() {
		return cimAppAdminRepository.findAll();
	}

}
