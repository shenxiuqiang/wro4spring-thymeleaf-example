package org.sevensource.wro4j.config;

import org.sevensource.wro4spring.WroDeliveryConfiguration;
import org.sevensource.wro4spring.config.DefaultAbstractWro4SpringConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Wro4SpringConfiguration extends DefaultAbstractWro4SpringConfiguration {

	@Override
	protected String getWroFile() {
		return super.getWroFile();
	}
	
	@Override	
	public WroDeliveryConfiguration wroDeliveryConfiguration() {
		WroDeliveryConfiguration configuration = new WroDeliveryConfiguration();
		configuration.setDevelopment(isDevelopment());
		configuration.setUriPrefix("/static/bundles/");
		//configuration.setCdnDomain("cdn.foo.com");
		return configuration;
	}
	
	@Override
	protected boolean isDevelopment() {
		return true;
	}
}
