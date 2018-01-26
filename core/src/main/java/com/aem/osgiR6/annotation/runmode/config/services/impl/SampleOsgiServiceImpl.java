/*
 *	author		: Adarsh
 *  Description : Implementation class of the OSGI service.
*/


package com.aem.osgiR6.annotation.runmode.config.services.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;


@Component(
    immediate = true,
    service = SampleOsgiService.class
)
public class SampleOsgiServiceImpl implements SampleOsgiService {
	
		private String sampleOsgiconfigVal;
		
		@Activate
		@Modified
		
		protected void activate(Map<String,Object> properties) {
			//Provided the property name given in the crx is 'sampleOsgiCanfigValue'. The value will be stored in sampleOsgiCanfigValue variable.
			this.sampleOsgiconfigVal = properties.get("sampleOsgiCanfigValue").toString();
		}
	}
}