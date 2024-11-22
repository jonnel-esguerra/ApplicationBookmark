package com.onsemi.cabm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema = "ssmp", name = "CIMAPP")
public class CIMApp {
	
	@Id
	@Column(name = "CAP_APPID")
	private String capAppID;
	
	@Column(name = "CAP_APPNAME")
	private String capAppName;
	
	@Column(name = "CAP_APPLAUNCHER")
	private String capAppLauncher;
	
	@Column(name = "CAP_APPSOURCE")
	private String capAppSource;
	
	@Column(name = "CAP_APPTARGET")
	private String capAppTarget;
	
	@Column(name = "CAP_APPIMAGESOURCE")
	private String capAppImageSource;
	
	@Column(name = "CAP_APPPANELCOLOR")
	private String capAppPanelColor;
	
	@Column(name = "CAP_USERID")
	private String capUserID;
	
	@Column(name = "CAP_DATE")
	private String capDate;
	
}
