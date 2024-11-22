package com.onsemi.cabm.response;



import com.onsemi.cabm.model.CIMApp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CIMAppResponse {
	
	private String capAppID;
	
	private String capAppName;
	
	private String capAppLauncher;
	
	private String capAppSource;
	
	private String capAppTarget;
	
	private String capAppImageSource;
	
	private String capAppPanelColor;
	
	private String capUserID;
	
	private String capDate;
	
	public CIMAppResponse (CIMApp cimApp) {
		this.capAppID = cimApp.getCapAppID();
		this.capAppName = cimApp.getCapAppName();
		this.capAppLauncher = cimApp.getCapAppLauncher();
		this.capAppSource = cimApp.getCapAppSource();
		this.capAppTarget = cimApp.getCapAppTarget();
		this.capAppImageSource = cimApp.getCapAppImageSource();
		this.capAppPanelColor = cimApp.getCapAppPanelColor();
		this.capUserID = cimApp.getCapUserID();
		this.capDate = cimApp.getCapDate();
	}
	

}
