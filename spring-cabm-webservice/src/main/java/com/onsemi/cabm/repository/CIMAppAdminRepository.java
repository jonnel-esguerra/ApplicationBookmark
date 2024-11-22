package com.onsemi.cabm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onsemi.cabm.model.CIMAppAdmin;


@Repository
public interface CIMAppAdminRepository extends JpaRepository<CIMAppAdmin, String> {

	
	
}
