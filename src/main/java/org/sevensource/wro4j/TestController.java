package org.sevensource.wro4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	private final static Logger logger = LoggerFactory
			.getLogger(TestController.class);
	
	@RequestMapping("/startpage.html")
	public String handleStartpage() {
		return "startpage";
	}
	
	@RequestMapping("/landingpage.html")
	public String handleLandingpage() {
		return "landingpage";
	}
}
