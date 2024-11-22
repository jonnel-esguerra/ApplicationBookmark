package com.onsemi.cabm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onsemi.cabm.dto.CIMAppGroupClientDto;
import com.onsemi.cabm.model.CIMAppGroupClient;




@Repository
public interface CIMAppGroupClientRepository extends JpaRepository<CIMAppGroupClient, String> {
		
	//public static final EntityManager em = null;
	
	//javax.persistence.Query query = em.createNativeQuery("findCIMAppByHostName", "Mapping.CIMAppGroupClientDto");
	//List<CIMAppGroupClientDto> findCIMAppByHostName(@Param("hostName") String hostName);
	@Query(nativeQuery = true)
	List<CIMAppGroupClientDto> findCIMAppByHostName(String hostName);


}
	

