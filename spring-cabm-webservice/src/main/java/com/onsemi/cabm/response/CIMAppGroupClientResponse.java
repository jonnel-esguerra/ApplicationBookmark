package com.onsemi.cabm.response;

import com.onsemi.cabm.dto.CIMAppGroupClientDto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CIMAppGroupClientResponse {
	
	private String hostName;
	
	private String appId;
	
	private String appGroupId;
	
	private String appName;
	
	private String appLauncher;
	
	private String appSource;
	
	private String appTarget;
	
	private String appImageSource;
	
	private String appPanelColor;
	
	public CIMAppGroupClientResponse (CIMAppGroupClientDto cimAppGroupClientDto) {
		this.hostName = cimAppGroupClientDto.getHostName();
		this.appId = cimAppGroupClientDto.getAppId();
		this.appGroupId = cimAppGroupClientDto.getAppGroupId();
		this.appName = cimAppGroupClientDto.getAppName();
		this.appLauncher = cimAppGroupClientDto.getAppLauncher();
		this.appSource = cimAppGroupClientDto.getAppSource();
		this.appTarget = cimAppGroupClientDto.getAppTarget();
		this.appImageSource = cimAppGroupClientDto.getAppImageSource();
		this.appPanelColor = cimAppGroupClientDto.getAppPanelColor();
	}
	
	
	

}
