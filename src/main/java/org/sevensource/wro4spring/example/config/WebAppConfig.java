package org.sevensource.wro4spring.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({Wro4SpringConfiguration.class})
public class WebAppConfig {

}
