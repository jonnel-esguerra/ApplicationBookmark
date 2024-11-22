package com.onsemi.cabm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onsemi.cabm.model.CIMAppClient;

@Repository
public interface CIMAppClientRepository extends JpaRepository<CIMAppClient, String>{

	
}
