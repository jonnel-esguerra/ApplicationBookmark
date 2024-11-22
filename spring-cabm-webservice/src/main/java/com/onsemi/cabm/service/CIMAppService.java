package com.onsemi.cabm.service;

import java.util.List;

import com.onsemi.cabm.model.CIMApp;


public interface CIMAppService {

	public List<CIMApp> getAllCIMApp ();

	public CIMApp getCIMAppById (String capAppID);
}
