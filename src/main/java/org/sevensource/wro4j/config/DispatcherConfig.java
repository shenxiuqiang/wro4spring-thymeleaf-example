package org.sevensource.wro4j.config;

import org.sevensource.wro4j.IndexController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses={IndexController.class})
@Import({ThymeleafMVCConfiguration.class})
public class DispatcherConfig {

}
