package com.onsemi.cabl.restconsumer.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CIMAppGroupClientResponse implements Serializable {

	private static final long serialVersionUID = 1L;

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
