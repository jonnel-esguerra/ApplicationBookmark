package com.onsemi.cabm.model;


import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;

import com.onsemi.cabm.dto.CIMAppGroupClientDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@NamedNativeQuery(name = "CIMAppGroupClient.findCIMAppByHostName",
query = "select  cac_hostname as hostName,\r\n"
		+ "        cap_appid as appId,\r\n"
		+ "        cag_appgroupid as appGroupId,\r\n"
		+ "        cap_appname as appName,\r\n"
		+ "        cap_applauncher as appLauncher,\r\n"
		+ "        cap_appsource as appSource,\r\n"
		+ "        cap_apptarget as appTarget,\r\n"
		+ "        cap_appimagesource as appImageSource,\r\n"
		+ "        cap_apppanelcolor as appPanelColor \r\n"
		+ "from ssmp.CIMAppClient\r\n"
		+ "inner join ssmp.CIMAppGroup\r\n"
		+ "ON cac_appgroupid = cag_appgroupid\r\n"
		+ "inner join ssmp.CIMApp\r\n"
		+ "ON CAG_APPID = CAP_APPID\r\n"
		+ "where cac_hostname = :hostName\r\n"
		+ "order by cap_appname",
resultSetMapping = "Mapping.CIMAppGroupClientDto")
@SqlResultSetMapping(name = "Mapping.CIMAppGroupClientDto",
classes = @ConstructorResult(targetClass = CIMAppGroupClientDto.class,
							columns = {@ColumnResult(name = "hostName"),
									@ColumnResult(name = "appId"),
									@ColumnResult(name = "appGroupId"),
									@ColumnResult(name = "appName"),
									@ColumnResult(name = "appLauncher"),
									@ColumnResult(name = "appSource"),
									@ColumnResult(name = "appTarget"),
									@ColumnResult(name = "appImageSource"),
									@ColumnResult(name = "appPanelColor")
							}
		)
)
@Entity
public class CIMAppGroupClient {
		
	@Id
	private String hostName;
	
	private String appId;
	
	private String appGroupId;
	
	private String appName;
	
	private String appLauncher;
	
	private String appSource;
	
	private String appTarget;
	
	private String appImageSource;
	
	private String appPanelColor;
	
}
