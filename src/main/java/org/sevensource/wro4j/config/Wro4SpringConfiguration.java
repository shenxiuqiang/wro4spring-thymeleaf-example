package org.sevensource.wro4j.config;

import org.sevensource.wro4spring.thymeleaf.AbstractWro4Spring4ThymeleafConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Wro4SpringConfiguration extends AbstractWro4Spring4ThymeleafConfiguration {

	@Override
	protected boolean isDevelopment() {
		return true;
	}

}
