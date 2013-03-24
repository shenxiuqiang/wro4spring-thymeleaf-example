package org.sevensource.wro4j.config;

import org.sevensource.wro4spring.thymeleaf.DefaultThymeleaf4SpringWroDialectConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThymeleafMVCConfiguration extends DefaultThymeleaf4SpringWroDialectConfiguration {

	@Override
	protected boolean isDevelopment() {
		return true;
	}
}
