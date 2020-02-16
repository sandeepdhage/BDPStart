package com.example.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@Slf4j
public class HelloController {

	@RequestMapping("/")
	public String index() {
		int test =10;
        log.info("First Entry !");
		return "Greetings from Spring Boot!";
	}

}
