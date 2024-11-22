package com.onsemi.cabm.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onsemi.cabm.model.CIMApp;

@Repository
public interface CIMAppRepository  extends JpaRepository<CIMApp, String> {
	
	@Query(name="CIMAppRepository.CIMAppById", nativeQuery = true)
	CIMApp findCIMAppById(@Param("cap_appid") String capAppID);
	

	

}
