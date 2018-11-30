package com.data;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	private static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/")
	public String homePage() {
		logger.info("Entered into homePage" + new Date());
		return "Hello User !! " + new Date();
	}
}