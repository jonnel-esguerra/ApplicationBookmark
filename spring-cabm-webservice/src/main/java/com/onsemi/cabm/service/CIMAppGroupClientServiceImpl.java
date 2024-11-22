package com.onsemi.cabm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onsemi.cabm.dto.CIMAppGroupClientDto;
import com.onsemi.cabm.repository.CIMAppGroupClientRepository;


@Service
public class CIMAppGroupClientServiceImpl implements CIMAppGroupClientService {
	
	@Autowired
	CIMAppGroupClientRepository cimAppGroupClientRepository;

	@Override
	public List<CIMAppGroupClientDto> getCIMAppGroupClientByHostName(String hostName) {

		return cimAppGroupClientRepository.findCIMAppByHostName(hostName);
	}

	
	
}
