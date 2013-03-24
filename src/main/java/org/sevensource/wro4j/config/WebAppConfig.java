package org.sevensource.wro4j.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({Wro4SpringConfiguration.class})
public class WebAppConfig {

}
