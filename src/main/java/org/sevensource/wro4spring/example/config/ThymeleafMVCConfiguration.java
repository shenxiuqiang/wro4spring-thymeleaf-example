package org.sevensource.wro4spring.example.config;

import org.sevensource.wro4spring.thymeleaf.DefaultThymeleaf4SpringWroDialectConfiguration;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.tiles2.spring.web.view.ThymeleafTilesView;
import org.thymeleaf.spring3.view.AbstractThymeleafView;

@Configuration
public class ThymeleafMVCConfiguration extends DefaultThymeleaf4SpringWroDialectConfiguration {

	@Override
	protected Class<? extends AbstractThymeleafView> getViewClass() {
		return ThymeleafTilesView.class;
	}
	
	@Override
	protected boolean isDevelopment() {
		return true;
	}
}
