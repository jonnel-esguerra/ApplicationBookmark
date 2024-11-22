package com.onsemi.cabm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CIMAppGroupClientDto {

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
