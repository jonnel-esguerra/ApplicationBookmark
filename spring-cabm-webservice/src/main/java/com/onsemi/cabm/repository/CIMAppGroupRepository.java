package com.onsemi.cabm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onsemi.cabm.model.CIMAppGroup;

@Repository
public interface CIMAppGroupRepository extends JpaRepository<CIMAppGroup, String>{

}
