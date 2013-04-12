package org.sevensource.wro4spring.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private final static Logger logger = LoggerFactory
			.getLogger(IndexController.class);
	
	@RequestMapping({"/", "/index.html"})
	public String handleIndex() {
		return "index";
	}
}
